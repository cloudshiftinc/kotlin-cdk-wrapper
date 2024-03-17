@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApprovedOrigin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnApprovedOriginProps cfnApprovedOriginProps = CfnApprovedOriginProps.builder()
 * .instanceId("instanceId")
 * .origin("origin")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html)
 */
public interface CfnApprovedOriginProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
   */
  public fun instanceId(): String

  /**
   * Domain name to be added to the allow-list of the instance.
   *
   * *Maximum* : `267`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
   */
  public fun origin(): String

  /**
   * A builder for [CfnApprovedOriginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    public fun instanceId(instanceId: String)

    /**
     * @param origin Domain name to be added to the allow-list of the instance. 
     * *Maximum* : `267`
     */
    public fun origin(origin: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnApprovedOriginProps.Builder =
        software.amazon.awscdk.services.connect.CfnApprovedOriginProps.builder()

    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param origin Domain name to be added to the allow-list of the instance. 
     * *Maximum* : `267`
     */
    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnApprovedOriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOriginProps,
  ) : CdkObject(cdkObject), CfnApprovedOriginProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * Domain name to be added to the allow-list of the instance.
     *
     * *Maximum* : `267`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
     */
    override fun origin(): String = unwrap(this).getOrigin()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApprovedOriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOriginProps):
        CfnApprovedOriginProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApprovedOriginProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApprovedOriginProps):
        software.amazon.awscdk.services.connect.CfnApprovedOriginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnApprovedOriginProps
  }
}
