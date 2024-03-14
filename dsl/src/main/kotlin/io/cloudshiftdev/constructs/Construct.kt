package io.cloudshiftdev.constructs

public open class Construct
internal constructor(
    private val cdkObject: software.constructs.Construct,
) : IConstruct {
    protected constructor(
        scope: Construct,
        id: String
    ) : this(software.constructs.Construct(unwrap(scope), id))

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public companion object {
        public fun isConstruct(x: Any): Boolean = software.constructs.Construct.isConstruct(x)

        internal fun wrap(cdkObject: software.constructs.Construct): Construct =
            Construct(cdkObject)

        internal fun unwrap(wrapped: Construct): software.constructs.Construct = wrapped.cdkObject
    }
}
