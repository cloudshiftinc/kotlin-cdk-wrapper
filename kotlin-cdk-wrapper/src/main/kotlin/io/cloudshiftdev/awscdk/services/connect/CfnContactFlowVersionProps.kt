@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnContactFlowVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnContactFlowVersionProps cfnContactFlowVersionProps = CfnContactFlowVersionProps.builder()
 * .contactFlowId("contactFlowId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html)
 */
public interface CfnContactFlowVersionProps {
  /**
   * The identifier of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-contactflowid)
   */
  public fun contactFlowId(): String

  /**
   * The description of the flow version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [CfnContactFlowVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactFlowId The identifier of the flow. 
     */
    public fun contactFlowId(contactFlowId: String)

    /**
     * @param description The description of the flow version.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnContactFlowVersionProps.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowVersionProps.builder()

    /**
     * @param contactFlowId The identifier of the flow. 
     */
    override fun contactFlowId(contactFlowId: String) {
      cdkBuilder.contactFlowId(contactFlowId)
    }

    /**
     * @param description The description of the flow version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowVersionProps,
  ) : CdkObject(cdkObject),
      CfnContactFlowVersionProps {
    /**
     * The identifier of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-contactflowid)
     */
    override fun contactFlowId(): String = unwrap(this).getContactFlowId()

    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactFlowVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowVersionProps):
        CfnContactFlowVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnContactFlowVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowVersionProps):
        software.amazon.awscdk.services.connect.CfnContactFlowVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnContactFlowVersionProps
  }
}
