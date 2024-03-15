@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccessPointProps {
  public fun bucket(): String

  public fun name(): String

  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun vpcConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: String)

    public fun name(name: String)

    public fun policy(policy: Any)

    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d599d4831fab54cc982cee4b3f94c758b82746f27ddcb45cff22512f9261458")
    public
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.builder()

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    override fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnAccessPoint.VpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d599d4831fab54cc982cee4b3f94c758b82746f27ddcb45cff22512f9261458")
    override
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnAccessPoint.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    override fun bucket(): String = unwrap(this).getBucket()

    override fun name(): String = unwrap(this).getName()

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3outposts.CfnAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnAccessPointProps
  }
}
