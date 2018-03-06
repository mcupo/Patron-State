using System;

namespace DoFactory.GangOfFour.State.Structural

{

    class MainApp

    {

        static void Main()

        {

            //Creo un contexto con un estado

            Context c = new Context(new ConcreteStateA());

            // Y lo hago variar

            c.Request();

            c.Request();

            c.Request();

            c.Request();

            Console.ReadKey();

        }

    }

    //La clase State

    abstract class State

    {

        public abstract void Handle(Context context);

    }

    class ConcreteStateA : State

    {

        public override void Handle(Context context)

        {

            context.State = new ConcreteStateB();

        }

    }

    class ConcreteStateB : State

    {

        public override void Handle(Context context)

        {

            context.State = new ConcreteStateA();

        }

    }

    class Context

    {

        private State _state;

        public Context(State state)

        {

            this.State = state;

        }

        public State State

        {

            get { return _state; }

            set

            {

                _state = value;

                Console.WriteLine("State: " + _state.GetType().Name);

            }

        }

        public void Request()

        {

            _state.Handle(this);

        }

    }

}
