@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationInstanceProps {
  public fun applicationInstanceIdToReplace(): String? =
      unwrap(this).getApplicationInstanceIdToReplace()

  public fun defaultRuntimeContextDevice(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

  public fun manifestPayload(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String)

    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String)

    public fun description(description: String)

    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable)

    public
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd3efea807fbf122d062d08d44ed045e13b748e6bcc6247ed872921e961ff4")
    public
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder.() -> Unit)

    public fun manifestPayload(manifestPayload: IResolvable)

    public fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15a37b78cffc511c2c561e09996e1d06f9a61ee37b2f9b8020da8fc55bfae49f")
    public
        fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun runtimeRoleArn(runtimeRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps.Builder =
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps.builder()

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
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(CfnApplicationInstance.ManifestOverridesPayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd3efea807fbf122d062d08d44ed045e13b748e6bcc6247ed872921e961ff4")
    override
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder.() -> Unit):
        Unit =
        manifestOverridesPayload(CfnApplicationInstance.ManifestOverridesPayloadProperty(manifestOverridesPayload))

    override fun manifestPayload(manifestPayload: IResolvable) {
      cdkBuilder.manifestPayload(manifestPayload.let(IResolvable::unwrap))
    }

    override fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty) {
      cdkBuilder.manifestPayload(manifestPayload.let(CfnApplicationInstance.ManifestPayloadProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15a37b78cffc511c2c561e09996e1d06f9a61ee37b2f9b8020da8fc55bfae49f")
    override
        fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty.Builder.() -> Unit):
        Unit = manifestPayload(CfnApplicationInstance.ManifestPayloadProperty(manifestPayload))

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

    public fun build(): software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps,
  ) : CdkObject(cdkObject), CfnApplicationInstanceProps {
    override fun applicationInstanceIdToReplace(): String? =
        unwrap(this).getApplicationInstanceIdToReplace()

    override fun defaultRuntimeContextDevice(): String =
        unwrap(this).getDefaultRuntimeContextDevice()

    override fun description(): String? = unwrap(this).getDescription()

    override fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

    override fun manifestPayload(): Any = unwrap(this).getManifestPayload()

    override fun name(): String? = unwrap(this).getName()

    override fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps):
        CfnApplicationInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInstanceProps):
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
  }
}
