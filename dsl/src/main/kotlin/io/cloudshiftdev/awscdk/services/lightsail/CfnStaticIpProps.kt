package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnStaticIpProps {
  /**
   * The instance that the static IP is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
   */
  public fun attachedTo(): String? = unwrap(this).getAttachedTo()

  /**
   * The name of the static IP.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
   */
  public fun staticIpName(): String

  /**
   * A builder for [CfnStaticIpProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachedTo The instance that the static IP is attached to.
     */
    public fun attachedTo(attachedTo: String)

    /**
     * @param staticIpName The name of the static IP. 
     */
    public fun staticIpName(staticIpName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnStaticIpProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnStaticIpProps.builder()

    /**
     * @param attachedTo The instance that the static IP is attached to.
     */
    override fun attachedTo(attachedTo: String) {
      cdkBuilder.attachedTo(attachedTo)
    }

    /**
     * @param staticIpName The name of the static IP. 
     */
    override fun staticIpName(staticIpName: String) {
      cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnStaticIpProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIpProps,
  ) : CdkObject(cdkObject), CfnStaticIpProps {
    /**
     * The instance that the static IP is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
     */
    override fun attachedTo(): String? = unwrap(this).getAttachedTo()

    /**
     * The name of the static IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
     */
    override fun staticIpName(): String = unwrap(this).getStaticIpName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStaticIpProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIpProps):
        CfnStaticIpProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStaticIpProps):
        software.amazon.awscdk.services.lightsail.CfnStaticIpProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnStaticIpProps
  }
}
