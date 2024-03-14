package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSchedulingPolicyProps {
  /**
   * The fair share policy of the scheduling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
   */
  public fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

  /**
   * The name of the scheduling policy.
   *
   * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags that you apply to the scheduling policy to help you categorize and organize your
   * resources.
   *
   * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
   * Reference* .
   *
   * These tags can be updated or removed using the
   * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
   * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html) API
   * operations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSchedulingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    public fun fairsharePolicy(fairsharePolicy: IResolvable)

    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty)

    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5208ec93f1f69db8e5e6bef25ca273523bb4a089e117da667d8fcef734b8c62e")
    public
        fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit)

    /**
     * @param name The name of the scheduling policy.
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     */
    public fun name(name: String)

    /**
     * @param tags The tags that you apply to the scheduling policy to help you categorize and
     * organize your resources.
     * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
     * Reference* .
     *
     * These tags can be updated or removed using the
     * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
     * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html)
     * API operations.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps.Builder =
        software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps.builder()

    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    override fun fairsharePolicy(fairsharePolicy: IResolvable) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(IResolvable::unwrap))
    }

    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    override fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(CfnSchedulingPolicy.FairsharePolicyProperty::unwrap))
    }

    /**
     * @param fairsharePolicy The fair share policy of the scheduling policy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5208ec93f1f69db8e5e6bef25ca273523bb4a089e117da667d8fcef734b8c62e")
    override
        fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit):
        Unit = fairsharePolicy(CfnSchedulingPolicy.FairsharePolicyProperty(fairsharePolicy))

    /**
     * @param name The name of the scheduling policy.
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags that you apply to the scheduling policy to help you categorize and
     * organize your resources.
     * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
     * Reference* .
     *
     * These tags can be updated or removed using the
     * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
     * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html)
     * API operations.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps,
  ) : CdkObject(cdkObject), CfnSchedulingPolicyProps {
    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     */
    override fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

    /**
     * The name of the scheduling policy.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags that you apply to the scheduling policy to help you categorize and organize your
     * resources.
     *
     * Each tag consists of a key and an optional value. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in *AWS General
     * Reference* .
     *
     * These tags can be updated or removed using the
     * [TagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_TagResource.html) and
     * [UntagResource](https://docs.aws.amazon.com/batch/latest/APIReference/API_UntagResource.html)
     * API operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchedulingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps):
        CfnSchedulingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchedulingPolicyProps):
        software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
  }
}
