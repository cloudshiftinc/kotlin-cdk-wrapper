package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

public interface CfnRegistryPolicyProps {
  /**
   * The JSON policy text for your registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
   */
  public fun policyText(): Any

  /**
   * A builder for [CfnRegistryPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyText The JSON policy text for your registry. 
     */
    public fun policyText(policyText: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.builder()

    /**
     * @param policyText The JSON policy text for your registry. 
     */
    override fun policyText(policyText: Any) {
      cdkBuilder.policyText(policyText)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps,
  ) : CdkObject(cdkObject), CfnRegistryPolicyProps {
    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     */
    override fun policyText(): Any = unwrap(this).getPolicyText()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps):
        CfnRegistryPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicyProps):
        software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
  }
}
