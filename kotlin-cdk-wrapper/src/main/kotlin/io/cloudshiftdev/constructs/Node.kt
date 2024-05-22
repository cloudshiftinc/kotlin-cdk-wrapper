@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class Node(
  cdkObject: software.constructs.Node,
) : CdkObject(cdkObject) {
  public constructor(
    host: Construct,
    scope: IConstruct,
    id: String,
  ) : this(software.constructs.Node(host.let(Construct.Companion::unwrap),
      scope.let(IConstruct.Companion::unwrap), id)
  )

  public open fun addDependency(deps: IDependable) {
    unwrap(this).addDependency(deps.let(IDependable.Companion::unwrap))
  }

  public open fun addMetadata(type: String, `data`: Any) {
    unwrap(this).addMetadata(type, `data`)
  }

  public open fun addMetadata(
    type: String,
    `data`: Any,
    options: MetadataOptions,
  ) {
    unwrap(this).addMetadata(type, `data`, options.let(MetadataOptions.Companion::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("541c530583473deb1509a25c7215d155d6c5bdc98606f876a75f85f51e9a5b14")
  public open fun addMetadata(
    type: String,
    `data`: Any,
    options: MetadataOptions.Builder.() -> Unit,
  ): Unit = addMetadata(type, `data`, MetadataOptions(options))

  public open fun addValidation(validation: IValidation) {
    unwrap(this).addValidation(validation.let(IValidation.Companion::unwrap))
  }

  public open fun addr(): String = unwrap(this).getAddr()

  public open fun allContext(): Any = unwrap(this).getAllContext()

  public open fun allContext(defaults: ObjectNode): Any = unwrap(this).getAllContext(defaults)

  public open fun children(): List<IConstruct> = unwrap(this).getChildren().map(IConstruct::wrap)

  public open fun context(key: String): Any = unwrap(this).getContext(key)

  public open fun context(key: String, `value`: Any) {
    unwrap(this).setContext(key, `value`)
  }

  public open fun defaultChild(): IConstruct? =
      unwrap(this).getDefaultChild()?.let(IConstruct::wrap)

  public open fun defaultChild(`value`: IConstruct) {
    unwrap(this).setDefaultChild(`value`.let(IConstruct.Companion::unwrap))
  }

  public open fun dependencies(): List<IConstruct> =
      unwrap(this).getDependencies().map(IConstruct::wrap)

  public open fun findAll(): List<IConstruct> = unwrap(this).findAll().map(IConstruct::wrap)

  public open fun findAll(order: ConstructOrder): List<IConstruct> =
      unwrap(this).findAll(order.let(ConstructOrder.Companion::unwrap)).map(IConstruct::wrap)

  public open fun findChild(id: String): IConstruct =
      unwrap(this).findChild(id).let(IConstruct::wrap)

  public open fun id(): String = unwrap(this).getId()

  public open fun lock() {
    unwrap(this).lock()
  }

  public open fun locked(): Boolean = unwrap(this).getLocked()

  public open fun metadata(): List<MetadataEntry> =
      unwrap(this).getMetadata().map(MetadataEntry::wrap)

  public open fun path(): String = unwrap(this).getPath()

  public open fun root(): IConstruct = unwrap(this).getRoot().let(IConstruct::wrap)

  public open fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)

  public open fun scopes(): List<IConstruct> = unwrap(this).getScopes().map(IConstruct::wrap)

  public open fun tryFindChild(id: String): IConstruct? =
      unwrap(this).tryFindChild(id)?.let(IConstruct::wrap)

  public open fun tryGetContext(key: String): Any = unwrap(this).tryGetContext(key)

  public open fun tryRemoveChild(childName: String): Boolean =
      unwrap(this).tryRemoveChild(childName)

  public open fun validate(): List<String> = unwrap(this).validate()

  public companion object {
    public val PATH_SEP: String = software.constructs.Node.PATH_SEP

    @Deprecated(message = "deprecated in CDK")
    public fun of(construct: IConstruct): Node =
        software.constructs.Node.of(construct.let(IConstruct.Companion::unwrap)).let(Node::wrap)

    internal fun wrap(cdkObject: software.constructs.Node): Node = Node(cdkObject)

    internal fun unwrap(wrapped: Node): software.constructs.Node = wrapped.cdkObject as
        software.constructs.Node
  }
}
