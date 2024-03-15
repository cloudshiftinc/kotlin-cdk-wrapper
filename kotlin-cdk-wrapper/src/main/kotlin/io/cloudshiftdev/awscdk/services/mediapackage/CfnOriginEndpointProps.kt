@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

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

public interface CfnOriginEndpointProps {
  public fun authorization(): Any? = unwrap(this).getAuthorization()

  public fun channelId(): String

  public fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  public fun dashPackage(): Any? = unwrap(this).getDashPackage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  public fun id(): String

  public fun manifestName(): String? = unwrap(this).getManifestName()

  public fun mssPackage(): Any? = unwrap(this).getMssPackage()

  public fun origination(): String? = unwrap(this).getOrigination()

  public fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

  public fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authorization(authorization: IResolvable)

    public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f801da8105bf39d97a2fbdeca325c2b6bd4d6171a1a2d66d9448ead22795f097")
    public
        fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty.Builder.() -> Unit)

    public fun channelId(channelId: String)

    public fun cmafPackage(cmafPackage: IResolvable)

    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14cb4e7ed8209566fedc946dcffa964029f068b8c482268aa0c3ec70c66abd25")
    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty.Builder.() -> Unit)

    public fun dashPackage(dashPackage: IResolvable)

    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a61d02d1efc5932dab8bf49c0c59685fe59699b4d1736ed0718e4efc4d0735")
    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun hlsPackage(hlsPackage: IResolvable)

    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b8f3001bd687a03b2149142ac34e936103f7a0bff40f15e75a1d5745c0d4185")
    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun manifestName(manifestName: String)

    public fun mssPackage(mssPackage: IResolvable)

    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4603520e616e20f4200d09ef31cb581ce170a1316d75f03bb7e3f94ea9a9665")
    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty.Builder.() -> Unit)

    public fun origination(origination: String)

    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeDelaySeconds(timeDelaySeconds: Number)

    public fun whitelist(whitelist: List<String>)

    public fun whitelist(vararg whitelist: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps.builder()

    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    override fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(CfnOriginEndpoint.AuthorizationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f801da8105bf39d97a2fbdeca325c2b6bd4d6171a1a2d66d9448ead22795f097")
    override
        fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty.Builder.() -> Unit):
        Unit = authorization(CfnOriginEndpoint.AuthorizationProperty(authorization))

    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    override fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CfnOriginEndpoint.CmafPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14cb4e7ed8209566fedc946dcffa964029f068b8c482268aa0c3ec70c66abd25")
    override fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty.Builder.() -> Unit):
        Unit = cmafPackage(CfnOriginEndpoint.CmafPackageProperty(cmafPackage))

    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    override fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(CfnOriginEndpoint.DashPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a61d02d1efc5932dab8bf49c0c59685fe59699b4d1736ed0718e4efc4d0735")
    override fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty.Builder.() -> Unit):
        Unit = dashPackage(CfnOriginEndpoint.DashPackageProperty(dashPackage))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    override fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(CfnOriginEndpoint.HlsPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b8f3001bd687a03b2149142ac34e936103f7a0bff40f15e75a1d5745c0d4185")
    override fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty.Builder.() -> Unit):
        Unit = hlsPackage(CfnOriginEndpoint.HlsPackageProperty(hlsPackage))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun manifestName(manifestName: String) {
      cdkBuilder.manifestName(manifestName)
    }

    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    override fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(CfnOriginEndpoint.MssPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4603520e616e20f4200d09ef31cb581ce170a1316d75f03bb7e3f94ea9a9665")
    override fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty.Builder.() -> Unit):
        Unit = mssPackage(CfnOriginEndpoint.MssPackageProperty(mssPackage))

    override fun origination(origination: String) {
      cdkBuilder.origination(origination)
    }

    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeDelaySeconds(timeDelaySeconds: Number) {
      cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    override fun whitelist(whitelist: List<String>) {
      cdkBuilder.whitelist(whitelist)
    }

    override fun whitelist(vararg whitelist: String): Unit = whitelist(whitelist.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointProps {
    override fun authorization(): Any? = unwrap(this).getAuthorization()

    override fun channelId(): String = unwrap(this).getChannelId()

    override fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

    override fun dashPackage(): Any? = unwrap(this).getDashPackage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

    override fun id(): String = unwrap(this).getId()

    override fun manifestName(): String? = unwrap(this).getManifestName()

    override fun mssPackage(): Any? = unwrap(this).getMssPackage()

    override fun origination(): String? = unwrap(this).getOrigination()

    override fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

    override fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps):
        CfnOriginEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointProps):
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
  }
}
