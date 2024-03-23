@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new pool of dedicated IP addresses.
 *
 * A pool can include one or more dedicated IP addresses that are associated with your AWS account .
 * You can associate a pool with a configuration set. When you send an email that uses that
 * configuration set, the message is sent from one of the addresses in the associated pool.
 *
 *
 * You can't delete dedicated IP pools that have a `STANDARD` scaling mode with one or more
 * dedicated IP addresses. This constraint doesn't apply to dedicated IP pools that have a `MANAGED`
 * scaling mode.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnDedicatedIpPool cfnDedicatedIpPool = CfnDedicatedIpPool.Builder.create(this,
 * "MyCfnDedicatedIpPool")
 * .poolName("poolName")
 * .scalingMode("scalingMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html)
 */
public open class CfnDedicatedIpPool(
  cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPool,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnDedicatedIpPool(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDedicatedIpPoolProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnDedicatedIpPool(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDedicatedIpPoolProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDedicatedIpPoolProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDedicatedIpPoolProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the dedicated IP pool that the IP address is associated with.
   */
  public open fun poolName(): String? = unwrap(this).getPoolName()

  /**
   * The name of the dedicated IP pool that the IP address is associated with.
   */
  public open fun poolName(`value`: String) {
    unwrap(this).setPoolName(`value`)
  }

  /**
   * The type of scaling mode.
   */
  public open fun scalingMode(): String? = unwrap(this).getScalingMode()

  /**
   * The type of scaling mode.
   */
  public open fun scalingMode(`value`: String) {
    unwrap(this).setScalingMode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnDedicatedIpPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the dedicated IP pool that the IP address is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-poolname)
     * @param poolName The name of the dedicated IP pool that the IP address is associated with. 
     */
    public fun poolName(poolName: String)

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
     * @param scalingMode The type of scaling mode. 
     */
    public fun scalingMode(scalingMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnDedicatedIpPool.Builder =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool.Builder.create(scope, id)

    /**
     * The name of the dedicated IP pool that the IP address is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-poolname)
     * @param poolName The name of the dedicated IP pool that the IP address is associated with. 
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

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
     * @param scalingMode The type of scaling mode. 
     */
    override fun scalingMode(scalingMode: String) {
      cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnDedicatedIpPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDedicatedIpPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDedicatedIpPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPool):
        CfnDedicatedIpPool = CfnDedicatedIpPool(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPool):
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool
  }
}
