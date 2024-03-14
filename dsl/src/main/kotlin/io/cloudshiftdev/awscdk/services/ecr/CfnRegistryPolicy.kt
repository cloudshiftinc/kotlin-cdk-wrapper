package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegistryPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The account ID of the private registry the policy is associated with.
   */
  public open fun attrRegistryId(): String = unwrap(this).getAttrRegistryId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The JSON policy text for your registry.
   */
  public open fun policyText(): Any = unwrap(this).getPolicyText()

  /**
   * The JSON policy text for your registry.
   */
  public open fun policyText(`value`: Any) {
    unwrap(this).setPolicyText(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRegistryPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     * @param policyText The JSON policy text for your registry. 
     */
    public fun policyText(policyText: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder.create(scope, id)

    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     * @param policyText The JSON policy text for your registry. 
     */
    override fun policyText(policyText: Any) {
      cdkBuilder.policyText(policyText)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistryPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicy):
        CfnRegistryPolicy = CfnRegistryPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicy):
        software.amazon.awscdk.services.ecr.CfnRegistryPolicy = wrapped.cdkObject
  }
}
