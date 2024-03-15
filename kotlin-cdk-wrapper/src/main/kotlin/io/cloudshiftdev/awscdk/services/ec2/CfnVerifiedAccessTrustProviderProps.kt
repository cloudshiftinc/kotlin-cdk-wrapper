@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVerifiedAccessTrustProviderProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

  public fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

  public fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

  public fun policyReferenceName(): String

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trustProviderType(): String

  public fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun deviceOptions(deviceOptions: IResolvable)

    public fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8c43d780c81d3cea6e3e6758e889d0ef1d1f2f21fb74ce3969a567cd54e1b16")
    public
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit)

    public fun deviceTrustProviderType(deviceTrustProviderType: String)

    public fun oidcOptions(oidcOptions: IResolvable)

    public fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b39af35a5a709647d60b4a3a19a76969cff3f4fc90bebda771c8b06e01b4d9")
    public
        fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder.() -> Unit)

    public fun policyReferenceName(policyReferenceName: String)

    public fun sseSpecification(sseSpecification: IResolvable)

    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f98acaa2a315f2bccaf39a204c40bad794ef8678bdd6657916475934dc0094d3")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trustProviderType(trustProviderType: String)

    public fun userTrustProviderType(userTrustProviderType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun deviceOptions(deviceOptions: IResolvable) {
      cdkBuilder.deviceOptions(deviceOptions.let(IResolvable::unwrap))
    }

    override
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty) {
      cdkBuilder.deviceOptions(deviceOptions.let(CfnVerifiedAccessTrustProvider.DeviceOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8c43d780c81d3cea6e3e6758e889d0ef1d1f2f21fb74ce3969a567cd54e1b16")
    override
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit):
        Unit = deviceOptions(CfnVerifiedAccessTrustProvider.DeviceOptionsProperty(deviceOptions))

    override fun deviceTrustProviderType(deviceTrustProviderType: String) {
      cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    override fun oidcOptions(oidcOptions: IResolvable) {
      cdkBuilder.oidcOptions(oidcOptions.let(IResolvable::unwrap))
    }

    override fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty) {
      cdkBuilder.oidcOptions(oidcOptions.let(CfnVerifiedAccessTrustProvider.OidcOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b39af35a5a709647d60b4a3a19a76969cff3f4fc90bebda771c8b06e01b4d9")
    override
        fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder.() -> Unit):
        Unit = oidcOptions(CfnVerifiedAccessTrustProvider.OidcOptionsProperty(oidcOptions))

    override fun policyReferenceName(policyReferenceName: String) {
      cdkBuilder.policyReferenceName(policyReferenceName)
    }

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessTrustProvider.SseSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f98acaa2a315f2bccaf39a204c40bad794ef8678bdd6657916475934dc0094d3")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder.() -> Unit):
        Unit =
        sseSpecification(CfnVerifiedAccessTrustProvider.SseSpecificationProperty(sseSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trustProviderType(trustProviderType: String) {
      cdkBuilder.trustProviderType(trustProviderType)
    }

    override fun userTrustProviderType(userTrustProviderType: String) {
      cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessTrustProviderProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

    override fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

    override fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

    override fun policyReferenceName(): String = unwrap(this).getPolicyReferenceName()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trustProviderType(): String = unwrap(this).getTrustProviderType()

    override fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVerifiedAccessTrustProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps):
        CfnVerifiedAccessTrustProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessTrustProviderProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
  }
}
