package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnDefaultViewAssociationProps {
  /**
   * The ARN of the view to set as the default for the AWS Region and AWS account in which you call
   * this operation.
   *
   * The specified view must already exist in the specified Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
   */
  public fun viewArn(): String

  /**
   * A builder for [CfnDefaultViewAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account
     * in which you call this operation. 
     * The specified view must already exist in the specified Region.
     */
    public fun viewArn(viewArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps.builder()

    /**
     * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account
     * in which you call this operation. 
     * The specified view must already exist in the specified Region.
     */
    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    public fun build():
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps,
  ) : CdkObject(cdkObject), CfnDefaultViewAssociationProps {
    /**
     * The ARN of the view to set as the default for the AWS Region and AWS account in which you
     * call this operation.
     *
     * The specified view must already exist in the specified Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
     */
    override fun viewArn(): String = unwrap(this).getViewArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDefaultViewAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps):
        CfnDefaultViewAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDefaultViewAssociationProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
  }
}
