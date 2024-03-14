package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Names internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Names,
) : CdkObject(cdkObject) {
  public companion object {
    public fun nodeUniqueId(node: Node): String =
        software.amazon.awscdk.Names.nodeUniqueId(node.let(Node::unwrap))

    public fun uniqueId(construct: IConstruct): String =
        software.amazon.awscdk.Names.uniqueId(construct.let(IConstruct::unwrap))

    public fun uniqueResourceName(construct: IConstruct, options: UniqueResourceNameOptions): String
        = software.amazon.awscdk.Names.uniqueResourceName(construct.let(IConstruct::unwrap),
        options.let(UniqueResourceNameOptions::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8f9b551f587c67b6cee20872585e9a43b39713f19a4e0c77035a077098420e5")
    public fun uniqueResourceName(construct: IConstruct,
        options: UniqueResourceNameOptions.Builder.() -> Unit): String =
        uniqueResourceName(construct, UniqueResourceNameOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.Names): Names = Names(cdkObject)

    internal fun unwrap(wrapped: Names): software.amazon.awscdk.Names = wrapped.cdkObject
  }
}
