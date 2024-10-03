@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnFlowVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnFlowVersionProps cfnFlowVersionProps = CfnFlowVersionProps.builder()
 * .flowArn("flowArn")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html)
 */
public interface CfnFlowVersionProps {
  /**
   * The description of the flow version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the flow that the version belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-flowarn)
   */
  public fun flowArn(): String

  /**
   * A builder for [CfnFlowVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the flow version.
     */
    public fun description(description: String)

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow that the version belongs to. 
     */
    public fun flowArn(flowArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlowVersionProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlowVersionProps.builder()

    /**
     * @param description The description of the flow version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow that the version belongs to. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersionProps,
  ) : CdkObject(cdkObject),
      CfnFlowVersionProps {
    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowversion.html#cfn-bedrock-flowversion-flowarn)
     */
    override fun flowArn(): String = unwrap(this).getFlowArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowVersionProps):
        CfnFlowVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVersionProps):
        software.amazon.awscdk.services.bedrock.CfnFlowVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnFlowVersionProps
  }
}
