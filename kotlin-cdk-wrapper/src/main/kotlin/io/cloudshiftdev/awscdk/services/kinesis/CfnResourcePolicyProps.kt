@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * Object resourcePolicy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * This is the name for the resource policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * This is the description for the resource policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcepolicy)
   */
  public fun resourcePolicy(): Any

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceArn This is the name for the resource policy. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param resourcePolicy This is the description for the resource policy. 
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps.builder()

    /**
     * @param resourceArn This is the name for the resource policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param resourcePolicy This is the description for the resource policy. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject),
      CfnResourcePolicyProps {
    /**
     * This is the name for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * This is the description for the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-resourcepolicy.html#cfn-kinesis-resourcepolicy-resourcepolicy)
     */
    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.CfnResourcePolicyProps
  }
}
