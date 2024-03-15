@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCoreDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: CoreDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(CoreDefinitionVersionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79d267ca4351c7f75793d2116483a930b2f5ecfc3b5a6ec3bce685dd34058b9a")
  public open fun initialVersion(`value`: CoreDefinitionVersionProperty.Builder.() -> Unit): Unit =
      initialVersion(CoreDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: CoreDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11db1e40fce099e2d02543e66dd51666e8eb4a4c6f3fc2ae6c4be023853fcb2c")
    public fun initialVersion(initialVersion: CoreDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition.Builder.create(scope, id)

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: CoreDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CoreDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11db1e40fce099e2d02543e66dd51666e8eb4a4c6f3fc2ae6c4be023853fcb2c")
    override fun initialVersion(initialVersion: CoreDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CoreDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition):
        CfnCoreDefinition = CfnCoreDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinition):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition = wrapped.cdkObject
  }

  public interface CoreProperty {
    public fun certificateArn(): String

    public fun id(): String

    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    public fun thingArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun id(id: String)

      public fun syncShadow(syncShadow: Boolean)

      public fun syncShadow(syncShadow: IResolvable)

      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty,
    ) : CdkObject(cdkObject), CoreProperty {
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      override fun id(): String = unwrap(this).getId()

      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty):
          CoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty
    }
  }

  public interface CoreDefinitionVersionProperty {
    public fun cores(): Any

    @CdkDslMarker
    public interface Builder {
      public fun cores(cores: IResolvable)

      public fun cores(cores: List<Any>)

      public fun cores(vararg cores: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty.builder()

      override fun cores(cores: IResolvable) {
        cdkBuilder.cores(cores.let(IResolvable::unwrap))
      }

      override fun cores(cores: List<Any>) {
        cdkBuilder.cores(cores)
      }

      override fun cores(vararg cores: Any): Unit = cores(cores.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty,
    ) : CdkObject(cdkObject), CoreDefinitionVersionProperty {
      override fun cores(): Any = unwrap(this).getCores()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty):
          CoreDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
    }
  }
}
