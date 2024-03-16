@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBridgeOutput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnBridgeOutputProps cfnBridgeOutputProps = CfnBridgeOutputProps.builder()
 * .bridgeArn("bridgeArn")
 * .name("name")
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html)
 */
public interface CfnBridgeOutputProps {
  /**
   * The ARN of the bridge that you want to describe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-bridgearn)
   */
  public fun bridgeArn(): String

  /**
   * The network output name.
   *
   * This name is used to reference the output and must be unique among outputs in this bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-name)
   */
  public fun name(): String

  /**
   * Add a network output to an existing bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
   */
  public fun networkOutput(): Any

  /**
   * A builder for [CfnBridgeOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    public fun bridgeArn(bridgeArn: String)

    /**
     * @param name The network output name. 
     * This name is used to reference the output and must be unique among outputs in this bridge.
     */
    public fun name(name: String)

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    public fun networkOutput(networkOutput: IResolvable)

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty)

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3999916e1f03ba7a4a8fcccf4e14d4b51debc62ebec897d60514865280db5eda")
    public
        fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps.builder()

    /**
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * @param name The network output name. 
     * This name is used to reference the output and must be unique among outputs in this bridge.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    override fun networkOutput(networkOutput: IResolvable) {
      cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
    }

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    override fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
      cdkBuilder.networkOutput(networkOutput.let(CfnBridgeOutput.BridgeNetworkOutputProperty::unwrap))
    }

    /**
     * @param networkOutput Add a network output to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3999916e1f03ba7a4a8fcccf4e14d4b51debc62ebec897d60514865280db5eda")
    override
        fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty.Builder.() -> Unit):
        Unit = networkOutput(CfnBridgeOutput.BridgeNetworkOutputProperty(networkOutput))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps,
  ) : CdkObject(cdkObject), CfnBridgeOutputProps {
    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-bridgearn)
     */
    override fun bridgeArn(): String = unwrap(this).getBridgeArn()

    /**
     * The network output name.
     *
     * This name is used to reference the output and must be unique among outputs in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     */
    override fun networkOutput(): Any = unwrap(this).getNetworkOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps):
        CfnBridgeOutputProps = CdkObjectWrappers.wrap(cdkObject) as CfnBridgeOutputProps

    internal fun unwrap(wrapped: CfnBridgeOutputProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps
  }
}
