@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnNetworkInsightsPathProps {
  public fun destination(): String? = unwrap(this).getDestination()

  public fun destinationIp(): String? = unwrap(this).getDestinationIp()

  public fun destinationPort(): Number? = unwrap(this).getDestinationPort()

  public fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

  public fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

  public fun protocol(): String

  public fun source(): String

  public fun sourceIp(): String? = unwrap(this).getSourceIp()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: String)

    public fun destinationIp(destinationIp: String)

    public fun destinationPort(destinationPort: Number)

    public fun filterAtDestination(filterAtDestination: IResolvable)

    public fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9255214da1bd1e8e2506f21fa104c69852b248f638ea1f5328fa996e8ac3de1d")
    public
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit)

    public fun filterAtSource(filterAtSource: IResolvable)

    public fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4997b41d43877b8f03ae45ed4287cc6ed6bd50922574997a076738712c7c83f")
    public
        fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit)

    public fun protocol(protocol: String)

    public fun source(source: String)

    public fun sourceIp(sourceIp: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.Builder
        = software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.builder()

    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    override fun destinationIp(destinationIp: String) {
      cdkBuilder.destinationIp(destinationIp)
    }

    override fun destinationPort(destinationPort: Number) {
      cdkBuilder.destinationPort(destinationPort)
    }

    override fun filterAtDestination(filterAtDestination: IResolvable) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(IResolvable::unwrap))
    }

    override
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(CfnNetworkInsightsPath.PathFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9255214da1bd1e8e2506f21fa104c69852b248f638ea1f5328fa996e8ac3de1d")
    override
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtDestination(CfnNetworkInsightsPath.PathFilterProperty(filterAtDestination))

    override fun filterAtSource(filterAtSource: IResolvable) {
      cdkBuilder.filterAtSource(filterAtSource.let(IResolvable::unwrap))
    }

    override fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty) {
      cdkBuilder.filterAtSource(filterAtSource.let(CfnNetworkInsightsPath.PathFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4997b41d43877b8f03ae45ed4287cc6ed6bd50922574997a076738712c7c83f")
    override
        fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtSource(CfnNetworkInsightsPath.PathFilterProperty(filterAtSource))

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun sourceIp(sourceIp: String) {
      cdkBuilder.sourceIp(sourceIp)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsPathProps {
    override fun destination(): String? = unwrap(this).getDestination()

    override fun destinationIp(): String? = unwrap(this).getDestinationIp()

    override fun destinationPort(): Number? = unwrap(this).getDestinationPort()

    override fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

    override fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

    override fun protocol(): String = unwrap(this).getProtocol()

    override fun source(): String = unwrap(this).getSource()

    override fun sourceIp(): String? = unwrap(this).getSourceIp()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps):
        CfnNetworkInsightsPathProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsPathProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps
  }
}
