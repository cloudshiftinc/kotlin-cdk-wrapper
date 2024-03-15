@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSourceLocationProps {
  public fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

  public fun defaultSegmentDeliveryConfiguration(): Any? =
      unwrap(this).getDefaultSegmentDeliveryConfiguration()

  public fun httpConfiguration(): Any

  public fun segmentDeliveryConfigurations(): Any? = unwrap(this).getSegmentDeliveryConfigurations()

  public fun sourceLocationName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessConfiguration(accessConfiguration: IResolvable)

    public
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f74dd3aefa72403ebb375768787b7f59169e8e401a466a018570f298fc8a31bf")
    public
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty.Builder.() -> Unit)

    public fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable)

    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e5c48c040286e9f3d71d7ba2fdecde94f836eb08446f0550fc3b05c11e63404")
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit)

    public fun httpConfiguration(httpConfiguration: IResolvable)

    public fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba396087f294b8df731e69300da8ff2e34439ccc24936086a3d503218fda5c1d")
    public
        fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty.Builder.() -> Unit)

    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable)

    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>)

    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps.builder()

    override fun accessConfiguration(accessConfiguration: IResolvable) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(IResolvable::unwrap))
    }

    override
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(CfnSourceLocation.AccessConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f74dd3aefa72403ebb375768787b7f59169e8e401a466a018570f298fc8a31bf")
    override
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessConfiguration(CfnSourceLocation.AccessConfigurationProperty(accessConfiguration))

    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(IResolvable::unwrap))
    }

    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e5c48c040286e9f3d71d7ba2fdecde94f836eb08446f0550fc3b05c11e63404")
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultSegmentDeliveryConfiguration(CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty(defaultSegmentDeliveryConfiguration))

    override fun httpConfiguration(httpConfiguration: IResolvable) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(IResolvable::unwrap))
    }

    override fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(CfnSourceLocation.HttpConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba396087f294b8df731e69300da8ff2e34439ccc24936086a3d503218fda5c1d")
    override
        fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty.Builder.() -> Unit):
        Unit = httpConfiguration(CfnSourceLocation.HttpConfigurationProperty(httpConfiguration))

    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations.let(IResolvable::unwrap))
    }

    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations)
    }

    override fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any): Unit =
        segmentDeliveryConfigurations(segmentDeliveryConfigurations.toList())

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps,
  ) : CdkObject(cdkObject), CfnSourceLocationProps {
    override fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

    override fun defaultSegmentDeliveryConfiguration(): Any? =
        unwrap(this).getDefaultSegmentDeliveryConfiguration()

    override fun httpConfiguration(): Any = unwrap(this).getHttpConfiguration()

    override fun segmentDeliveryConfigurations(): Any? =
        unwrap(this).getSegmentDeliveryConfigurations()

    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSourceLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps):
        CfnSourceLocationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSourceLocationProps):
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps
  }
}
