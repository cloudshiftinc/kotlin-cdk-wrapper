@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVerifiedAccessInstanceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

  public fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun verifiedAccessTrustProviderIds(): List<String> =
      unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

  public fun verifiedAccessTrustProviders(): Any? = unwrap(this).getVerifiedAccessTrustProviders()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fipsEnabled(fipsEnabled: Boolean)

    public fun fipsEnabled(fipsEnabled: IResolvable)

    public fun loggingConfigurations(loggingConfigurations: IResolvable)

    public
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28935767be0a5523e044750fd892a346d2401be507c1591d91d07813534f7706")
    public
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>)

    public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String)

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable)

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>)

    public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fipsEnabled(fipsEnabled: Boolean) {
      cdkBuilder.fipsEnabled(fipsEnabled)
    }

    override fun fipsEnabled(fipsEnabled: IResolvable) {
      cdkBuilder.fipsEnabled(fipsEnabled.let(IResolvable::unwrap))
    }

    override fun loggingConfigurations(loggingConfigurations: IResolvable) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(IResolvable::unwrap))
    }

    override
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(CfnVerifiedAccessInstance.VerifiedAccessLogsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28935767be0a5523e044750fd892a346d2401be507c1591d91d07813534f7706")
    override
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit):
        Unit =
        loggingConfigurations(CfnVerifiedAccessInstance.VerifiedAccessLogsProperty(loggingConfigurations))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>) {
      cdkBuilder.verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds)
    }

    override fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String): Unit
        = verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds.toList())

    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders.let(IResolvable::unwrap))
    }

    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    override fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any): Unit =
        verifiedAccessTrustProviders(verifiedAccessTrustProviders.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessInstanceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

    override fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun verifiedAccessTrustProviderIds(): List<String> =
        unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

    override fun verifiedAccessTrustProviders(): Any? =
        unwrap(this).getVerifiedAccessTrustProviders()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps):
        CfnVerifiedAccessInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessInstanceProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
  }
}
