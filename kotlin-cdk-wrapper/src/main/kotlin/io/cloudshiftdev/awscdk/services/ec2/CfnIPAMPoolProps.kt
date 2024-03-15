@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIPAMPoolProps {
  public fun addressFamily(): String

  public fun allocationDefaultNetmaskLength(): Number? =
      unwrap(this).getAllocationDefaultNetmaskLength()

  public fun allocationMaxNetmaskLength(): Number? = unwrap(this).getAllocationMaxNetmaskLength()

  public fun allocationMinNetmaskLength(): Number? = unwrap(this).getAllocationMinNetmaskLength()

  public fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

  public fun autoImport(): Any? = unwrap(this).getAutoImport()

  public fun awsService(): String? = unwrap(this).getAwsService()

  public fun description(): String? = unwrap(this).getDescription()

  public fun ipamScopeId(): String

  public fun locale(): String? = unwrap(this).getLocale()

  public fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

  public fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

  public fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

  public fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

  public fun sourceResource(): Any? = unwrap(this).getSourceResource()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addressFamily(addressFamily: String)

    public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number)

    public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number)

    public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number)

    public fun allocationResourceTags(allocationResourceTags: IResolvable)

    public fun allocationResourceTags(allocationResourceTags: List<Any>)

    public fun allocationResourceTags(vararg allocationResourceTags: Any)

    public fun autoImport(autoImport: Boolean)

    public fun autoImport(autoImport: IResolvable)

    public fun awsService(awsService: String)

    public fun description(description: String)

    public fun ipamScopeId(ipamScopeId: String)

    public fun locale(locale: String)

    public fun provisionedCidrs(provisionedCidrs: IResolvable)

    public fun provisionedCidrs(provisionedCidrs: List<Any>)

    public fun provisionedCidrs(vararg provisionedCidrs: Any)

    public fun publicIpSource(publicIpSource: String)

    public fun publiclyAdvertisable(publiclyAdvertisable: Boolean)

    public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable)

    public fun sourceIpamPoolId(sourceIpamPoolId: String)

    public fun sourceResource(sourceResource: IResolvable)

    public fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4db6925277dc3dc73c32de05b67eeff3227a012c8b9523d394c6cb0022bee1b")
    public fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps.builder()

    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    override fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
      cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
    }

    override fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
      cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
    }

    override fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
      cdkBuilder.allocationMinNetmaskLength(allocationMinNetmaskLength)
    }

    override fun allocationResourceTags(allocationResourceTags: IResolvable) {
      cdkBuilder.allocationResourceTags(allocationResourceTags.let(IResolvable::unwrap))
    }

    override fun allocationResourceTags(allocationResourceTags: List<Any>) {
      cdkBuilder.allocationResourceTags(allocationResourceTags)
    }

    override fun allocationResourceTags(vararg allocationResourceTags: Any): Unit =
        allocationResourceTags(allocationResourceTags.toList())

    override fun autoImport(autoImport: Boolean) {
      cdkBuilder.autoImport(autoImport)
    }

    override fun autoImport(autoImport: IResolvable) {
      cdkBuilder.autoImport(autoImport.let(IResolvable::unwrap))
    }

    override fun awsService(awsService: String) {
      cdkBuilder.awsService(awsService)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipamScopeId(ipamScopeId: String) {
      cdkBuilder.ipamScopeId(ipamScopeId)
    }

    override fun locale(locale: String) {
      cdkBuilder.locale(locale)
    }

    override fun provisionedCidrs(provisionedCidrs: IResolvable) {
      cdkBuilder.provisionedCidrs(provisionedCidrs.let(IResolvable::unwrap))
    }

    override fun provisionedCidrs(provisionedCidrs: List<Any>) {
      cdkBuilder.provisionedCidrs(provisionedCidrs)
    }

    override fun provisionedCidrs(vararg provisionedCidrs: Any): Unit =
        provisionedCidrs(provisionedCidrs.toList())

    override fun publicIpSource(publicIpSource: String) {
      cdkBuilder.publicIpSource(publicIpSource)
    }

    override fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    override fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable.let(IResolvable::unwrap))
    }

    override fun sourceIpamPoolId(sourceIpamPoolId: String) {
      cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
    }

    override fun sourceResource(sourceResource: IResolvable) {
      cdkBuilder.sourceResource(sourceResource.let(IResolvable::unwrap))
    }

    override fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty) {
      cdkBuilder.sourceResource(sourceResource.let(CfnIPAMPool.SourceResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4db6925277dc3dc73c32de05b67eeff3227a012c8b9523d394c6cb0022bee1b")
    override
        fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty.Builder.() -> Unit):
        Unit = sourceResource(CfnIPAMPool.SourceResourceProperty(sourceResource))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps,
  ) : CdkObject(cdkObject), CfnIPAMPoolProps {
    override fun addressFamily(): String = unwrap(this).getAddressFamily()

    override fun allocationDefaultNetmaskLength(): Number? =
        unwrap(this).getAllocationDefaultNetmaskLength()

    override fun allocationMaxNetmaskLength(): Number? =
        unwrap(this).getAllocationMaxNetmaskLength()

    override fun allocationMinNetmaskLength(): Number? =
        unwrap(this).getAllocationMinNetmaskLength()

    override fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

    override fun autoImport(): Any? = unwrap(this).getAutoImport()

    override fun awsService(): String? = unwrap(this).getAwsService()

    override fun description(): String? = unwrap(this).getDescription()

    override fun ipamScopeId(): String = unwrap(this).getIpamScopeId()

    override fun locale(): String? = unwrap(this).getLocale()

    override fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

    override fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

    override fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

    override fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

    override fun sourceResource(): Any? = unwrap(this).getSourceResource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps):
        CfnIPAMPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolProps):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps
  }
}
