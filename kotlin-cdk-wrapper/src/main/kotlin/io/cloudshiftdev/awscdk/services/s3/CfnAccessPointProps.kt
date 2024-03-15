@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccessPointProps {
  public fun bucket(): String

  public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  public fun name(): String? = unwrap(this).getName()

  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: String)

    public fun bucketAccountId(bucketAccountId: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("564c702c108265cf01bc21711a1c41481841008d417b48addba2353645ba5fa5")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12db2d4d64eaab5c02cb014fe14c2818bbd8dc93e278ddc724465ebe849d346c")
    public
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3.CfnAccessPointProps.builder()

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnAccessPoint.PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("564c702c108265cf01bc21711a1c41481841008d417b48addba2353645ba5fa5")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnAccessPoint.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    override fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnAccessPoint.VpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12db2d4d64eaab5c02cb014fe14c2818bbd8dc93e278ddc724465ebe849d346c")
    override
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnAccessPoint.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    override fun bucket(): String = unwrap(this).getBucket()

    override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    override fun name(): String? = unwrap(this).getName()

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3.CfnAccessPointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnAccessPointProps
  }
}
