package io.cloudshiftdev.constructs

public interface IConstruct : IDependable {
    public fun node(): Node

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.constructs.IConstruct,
    ) : IConstruct {
        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.constructs.IConstruct): IConstruct =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: IConstruct): software.constructs.IConstruct =
            (wrapped as Wrapper).cdkObject
    }
}
