package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiRegionAccessPointPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Policy Status associated with this Multi Region Access Point.
   */
  public open fun attrPolicyStatus(): IResolvable =
      unwrap(this).getAttrPolicyStatus().let(IResolvable::wrap)

  /**
   * Specifies whether the policy is public or not.
   */
  public open fun attrPolicyStatusIsPublic(): String = unwrap(this).getAttrPolicyStatusIsPublic()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Multi-Region Access Point.
   */
  public open fun mrapName(): String = unwrap(this).getMrapName()

  /**
   * The name of the Multi-Region Access Point.
   */
  public open fun mrapName(`value`: String) {
    unwrap(this).setMrapName(`value`)
  }

  /**
   * The access policy associated with the Multi-Region Access Point.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * The access policy associated with the Multi-Region Access Point.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnMultiRegionAccessPointPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
     * @param mrapName The name of the Multi-Region Access Point. 
     */
    public fun mrapName(mrapName: String)

    /**
     * The access policy associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
     * @param policy The access policy associated with the Multi-Region Access Point. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.Builder.create(scope, id)

    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
     * @param mrapName The name of the Multi-Region Access Point. 
     */
    override fun mrapName(mrapName: String) {
      cdkBuilder.mrapName(mrapName)
    }

    /**
     * The access policy associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
     * @param policy The access policy associated with the Multi-Region Access Point. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiRegionAccessPointPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiRegionAccessPointPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy):
        CfnMultiRegionAccessPointPolicy = CfnMultiRegionAccessPointPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointPolicy):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy = wrapped.cdkObject
  }

  public interface PolicyStatusProperty {
    /**
     * The policy status for this bucket.
     *
     * `TRUE` indicates that this bucket is public. `FALSE` indicates that the bucket is not public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspointpolicy-policystatus.html#cfn-s3-multiregionaccesspointpolicy-policystatus-ispublic)
     */
    public fun isPublic(): String

    /**
     * A builder for [PolicyStatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isPublic The policy status for this bucket. 
       * `TRUE` indicates that this bucket is public. `FALSE` indicates that the bucket is not
       * public.
       */
      public fun isPublic(isPublic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder()

      /**
       * @param isPublic The policy status for this bucket. 
       * `TRUE` indicates that this bucket is public. `FALSE` indicates that the bucket is not
       * public.
       */
      override fun isPublic(isPublic: String) {
        cdkBuilder.isPublic(isPublic)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty,
    ) : CdkObject(cdkObject), PolicyStatusProperty {
      /**
       * The policy status for this bucket.
       *
       * `TRUE` indicates that this bucket is public. `FALSE` indicates that the bucket is not
       * public.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspointpolicy-policystatus.html#cfn-s3-multiregionaccesspointpolicy-policystatus-ispublic)
       */
      override fun isPublic(): String = unwrap(this).getIsPublic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty):
          PolicyStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyStatusProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty
    }
  }
}
