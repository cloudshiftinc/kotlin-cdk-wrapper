package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnDedicatedIpPoolProps {
  /**
   * The name of the dedicated IP pool that the IP address is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-poolname)
   */
  public fun poolName(): String? = unwrap(this).getPoolName()

  /**
   * The type of scaling mode.
   *
   * The following options are available:
   *
   * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
   * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
   *
   * The `STANDARD` option is selected by default if no value is specified.
   *
   *
   * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
   * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
   * supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-scalingmode)
   */
  public fun scalingMode(): String? = unwrap(this).getScalingMode()

  /**
   * A builder for [CfnDedicatedIpPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param poolName The name of the dedicated IP pool that the IP address is associated with.
     */
    public fun poolName(poolName: String)

    /**
     * @param scalingMode The type of scaling mode.
     * The following options are available:
     *
     * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
     * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
     *
     * The `STANDARD` option is selected by default if no value is specified.
     *
     *
     * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
     * supported.
     */
    public fun scalingMode(scalingMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps.builder()

    /**
     * @param poolName The name of the dedicated IP pool that the IP address is associated with.
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    /**
     * @param scalingMode The type of scaling mode.
     * The following options are available:
     *
     * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
     * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
     *
     * The `STANDARD` option is selected by default if no value is specified.
     *
     *
     * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
     * supported.
     */
    override fun scalingMode(scalingMode: String) {
      cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps,
  ) : CdkObject(cdkObject), CfnDedicatedIpPoolProps {
    /**
     * The name of the dedicated IP pool that the IP address is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-poolname)
     */
    override fun poolName(): String? = unwrap(this).getPoolName()

    /**
     * The type of scaling mode.
     *
     * The following options are available:
     *
     * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
     * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
     *
     * The `STANDARD` option is selected by default if no value is specified.
     *
     *
     * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
     * supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-scalingmode)
     */
    override fun scalingMode(): String? = unwrap(this).getScalingMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps):
        CfnDedicatedIpPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPoolProps):
        software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
  }
}
