@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationInstanceIdToReplace(): String? =
      unwrap(this).getApplicationInstanceIdToReplace()

  public open fun applicationInstanceIdToReplace(`value`: String) {
    unwrap(this).setApplicationInstanceIdToReplace(`value`)
  }

  public open fun attrApplicationInstanceId(): String = unwrap(this).getAttrApplicationInstanceId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): Number = unwrap(this).getAttrCreatedTime()

  public open fun attrDefaultRuntimeContextDeviceName(): String =
      unwrap(this).getAttrDefaultRuntimeContextDeviceName()

  public open fun attrHealthStatus(): String = unwrap(this).getAttrHealthStatus()

  public open fun attrLastUpdatedTime(): Number = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusDescription(): String = unwrap(this).getAttrStatusDescription()

  public open fun defaultRuntimeContextDevice(): String =
      unwrap(this).getDefaultRuntimeContextDevice()

  public open fun defaultRuntimeContextDevice(`value`: String) {
    unwrap(this).setDefaultRuntimeContextDevice(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

  public open fun manifestOverridesPayload(`value`: IResolvable) {
    unwrap(this).setManifestOverridesPayload(`value`.let(IResolvable::unwrap))
  }

  public open fun manifestOverridesPayload(`value`: ManifestOverridesPayloadProperty) {
    unwrap(this).setManifestOverridesPayload(`value`.let(ManifestOverridesPayloadProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5766abb9a0020ee6ac0260264091b352d741f2a8af4117d081a7a284267cdf2")
  public open
      fun manifestOverridesPayload(`value`: ManifestOverridesPayloadProperty.Builder.() -> Unit):
      Unit = manifestOverridesPayload(ManifestOverridesPayloadProperty(`value`))

  public open fun manifestPayload(): Any = unwrap(this).getManifestPayload()

  public open fun manifestPayload(`value`: IResolvable) {
    unwrap(this).setManifestPayload(`value`.let(IResolvable::unwrap))
  }

  public open fun manifestPayload(`value`: ManifestPayloadProperty) {
    unwrap(this).setManifestPayload(`value`.let(ManifestPayloadProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c811b14b9ad4ad01b324e420d5a060a89d9d73b145738c3dda78891abb0aa6b8")
  public open fun manifestPayload(`value`: ManifestPayloadProperty.Builder.() -> Unit): Unit =
      manifestPayload(ManifestPayloadProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  public open fun runtimeRoleArn(`value`: String) {
    unwrap(this).setRuntimeRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String)

    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String)

    public fun description(description: String)

    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable)

    public fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3fea6e0388b64f4224c3966cc05a778b0e96eff05e2571d6856a0d19cede2ff")
    public
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty.Builder.() -> Unit)

    public fun manifestPayload(manifestPayload: IResolvable)

    public fun manifestPayload(manifestPayload: ManifestPayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9948972873d9876a1879bd640f247de1c5d81f10a5efe27effe1ddbf495bb9f")
    public fun manifestPayload(manifestPayload: ManifestPayloadProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun runtimeRoleArn(runtimeRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnApplicationInstance.Builder
        = software.amazon.awscdk.services.panorama.CfnApplicationInstance.Builder.create(scope, id)

    override fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
      cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    override fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
      cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(IResolvable::unwrap))
    }

    override
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(ManifestOverridesPayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3fea6e0388b64f4224c3966cc05a778b0e96eff05e2571d6856a0d19cede2ff")
    override
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty.Builder.() -> Unit):
        Unit = manifestOverridesPayload(ManifestOverridesPayloadProperty(manifestOverridesPayload))

    override fun manifestPayload(manifestPayload: IResolvable) {
      cdkBuilder.manifestPayload(manifestPayload.let(IResolvable::unwrap))
    }

    override fun manifestPayload(manifestPayload: ManifestPayloadProperty) {
      cdkBuilder.manifestPayload(manifestPayload.let(ManifestPayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9948972873d9876a1879bd640f247de1c5d81f10a5efe27effe1ddbf495bb9f")
    override fun manifestPayload(manifestPayload: ManifestPayloadProperty.Builder.() -> Unit): Unit
        = manifestPayload(ManifestPayloadProperty(manifestPayload))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnApplicationInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.panorama.CfnApplicationInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance):
        CfnApplicationInstance = CfnApplicationInstance(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInstance):
        software.amazon.awscdk.services.panorama.CfnApplicationInstance = wrapped.cdkObject
  }

  public interface ManifestOverridesPayloadProperty {
    public fun payloadData(): String? = unwrap(this).getPayloadData()

    @CdkDslMarker
    public interface Builder {
      public fun payloadData(payloadData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder
          =
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty.builder()

      override fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
      }

      public fun build():
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty,
    ) : CdkObject(cdkObject), ManifestOverridesPayloadProperty {
      override fun payloadData(): String? = unwrap(this).getPayloadData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestOverridesPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty):
          ManifestOverridesPayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestOverridesPayloadProperty):
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
    }
  }

  public interface ManifestPayloadProperty {
    public fun payloadData(): String? = unwrap(this).getPayloadData()

    @CdkDslMarker
    public interface Builder {
      public fun payloadData(payloadData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty.Builder
          =
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty.builder()

      override fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
      }

      public fun build():
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty,
    ) : CdkObject(cdkObject), ManifestPayloadProperty {
      override fun payloadData(): String? = unwrap(this).getPayloadData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty):
          ManifestPayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestPayloadProperty):
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty
    }
  }
}
