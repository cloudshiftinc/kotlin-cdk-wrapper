@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Batch::SchedulingPolicy` resource specifies the parameters for an AWS Batch scheduling
 * policy.
 *
 * For more information, see [Scheduling
 * Policies](https://docs.aws.amazon.com/batch/latest/userguide/scheduling_policies.html) in the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnSchedulingPolicy cfnSchedulingPolicy = CfnSchedulingPolicy.Builder.create(this,
 * "MyCfnSchedulingPolicy")
 * .fairsharePolicy(FairsharePolicyProperty.builder()
 * .computeReservation(123)
 * .shareDecaySeconds(123)
 * .shareDistribution(List.of(ShareAttributesProperty.builder()
 * .shareIdentifier("shareIdentifier")
 * .weightFactor(123)
 * .build()))
 * .build())
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html)
 */
public open class CfnSchedulingPolicy(
  cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.CfnSchedulingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchedulingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.batch.CfnSchedulingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSchedulingPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchedulingPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSchedulingPolicyProps(props)
  )

  /**
   * Returns the scheduling policy ARN, such as `batch: *us-east-1* : *111122223333*
   * :scheduling-policy/ *HighPriority*` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The fair share policy of the scheduling policy.
   */
  public open fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

  /**
   * The fair share policy of the scheduling policy.
   */
  public open fun fairsharePolicy(`value`: IResolvable) {
    unwrap(this).setFairsharePolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The fair share policy of the scheduling policy.
   */
  public open fun fairsharePolicy(`value`: FairsharePolicyProperty) {
    unwrap(this).setFairsharePolicy(`value`.let(FairsharePolicyProperty.Companion::unwrap))
  }

  /**
   * The fair share policy of the scheduling policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a351e3ec9e4a92bd34a05454d73a1044d587269089d010ef3a12a679161e4dd8")
  public open fun fairsharePolicy(`value`: FairsharePolicyProperty.Builder.() -> Unit): Unit =
      fairsharePolicy(FairsharePolicyProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the scheduling policy.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the scheduling policy.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that you apply to the scheduling policy to help you categorize and organize your
   * resources.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags that you apply to the scheduling policy to help you categorize and organize your
   * resources.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.CfnSchedulingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    public fun fairsharePolicy(fairsharePolicy: IResolvable)

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    public fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty)

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06a0b5b52fb1318708cc740c9dcf623307c96501bdeface2fff8746888e96")
    public fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty.Builder.() -> Unit)

    /**
     * The name of the scheduling policy.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
     * @param name The name of the scheduling policy. 
     */
    public fun name(name: String)

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
     * @param tags The tags that you apply to the scheduling policy to help you categorize and
     * organize your resources. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.Builder =
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy.Builder.create(scope, id)

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    override fun fairsharePolicy(fairsharePolicy: IResolvable) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    override fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(FairsharePolicyProperty.Companion::unwrap))
    }

    /**
     * The fair share policy of the scheduling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy)
     * @param fairsharePolicy The fair share policy of the scheduling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06a0b5b52fb1318708cc740c9dcf623307c96501bdeface2fff8746888e96")
    override fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty.Builder.() -> Unit): Unit
        = fairsharePolicy(FairsharePolicyProperty(fairsharePolicy))

    /**
     * The name of the scheduling policy.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html#cfn-batch-schedulingpolicy-name)
     * @param name The name of the scheduling policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags The tags that you apply to the scheduling policy to help you categorize and
     * organize your resources. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnSchedulingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedulingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedulingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy):
        CfnSchedulingPolicy = CfnSchedulingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnSchedulingPolicy):
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy
  }

  /**
   * The fair share policy for a scheduling policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * FairsharePolicyProperty fairsharePolicyProperty = FairsharePolicyProperty.builder()
   * .computeReservation(123)
   * .shareDecaySeconds(123)
   * .shareDistribution(List.of(ShareAttributesProperty.builder()
   * .shareIdentifier("shareIdentifier")
   * .weightFactor(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html)
   */
  public interface FairsharePolicyProperty {
    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that
     * aren't already used.
     *
     * The reserved ratio is `( *computeReservation* /100)^ *ActiveFairShares*` where
     * `*ActiveFairShares*` is the number of active fair share identifiers.
     *
     * For example, a `computeReservation` value of 50 indicates that AWS Batch reserves 50% of the
     * maximum available vCPU if there's only one fair share identifier. It reserves 25% if there are
     * two fair share identifiers. It reserves 12.5% if there are three fair share identifiers. A
     * `computeReservation` value of 25 indicates that AWS Batch should reserve 25% of the maximum
     * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
     * identifiers, and 1.56% if there are three fair share identifiers.
     *
     * The minimum value is 0 and the maximum value is 99.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-computereservation)
     */
    public fun computeReservation(): Number? = unwrap(this).getComputeReservation()

    /**
     * The amount of time (in seconds) to use to calculate a fair share percentage for each fair
     * share identifier in use.
     *
     * A value of zero (0) indicates that only current usage is measured. The decay allows for more
     * recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is
     * 604800 (1 week).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-sharedecayseconds)
     */
    public fun shareDecaySeconds(): Number? = unwrap(this).getShareDecaySeconds()

    /**
     * An array of `SharedIdentifier` objects that contain the weights for the fair share
     * identifiers for the fair share policy.
     *
     * Fair share identifiers that aren't included have a default weight of `1.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-sharedistribution)
     */
    public fun shareDistribution(): Any? = unwrap(this).getShareDistribution()

    /**
     * A builder for [FairsharePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeReservation A value used to reserve some of the available maximum vCPU for
       * fair share identifiers that aren't already used.
       * The reserved ratio is `( *computeReservation* /100)^ *ActiveFairShares*` where
       * `*ActiveFairShares*` is the number of active fair share identifiers.
       *
       * For example, a `computeReservation` value of 50 indicates that AWS Batch reserves 50% of
       * the maximum available vCPU if there's only one fair share identifier. It reserves 25% if there
       * are two fair share identifiers. It reserves 12.5% if there are three fair share identifiers. A
       * `computeReservation` value of 25 indicates that AWS Batch should reserve 25% of the maximum
       * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
       * identifiers, and 1.56% if there are three fair share identifiers.
       *
       * The minimum value is 0 and the maximum value is 99.
       */
      public fun computeReservation(computeReservation: Number)

      /**
       * @param shareDecaySeconds The amount of time (in seconds) to use to calculate a fair share
       * percentage for each fair share identifier in use.
       * A value of zero (0) indicates that only current usage is measured. The decay allows for
       * more recently run jobs to have more weight than jobs that ran earlier. The maximum supported
       * value is 604800 (1 week).
       */
      public fun shareDecaySeconds(shareDecaySeconds: Number)

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      public fun shareDistribution(shareDistribution: IResolvable)

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      public fun shareDistribution(shareDistribution: List<Any>)

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      public fun shareDistribution(vararg shareDistribution: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty.builder()

      /**
       * @param computeReservation A value used to reserve some of the available maximum vCPU for
       * fair share identifiers that aren't already used.
       * The reserved ratio is `( *computeReservation* /100)^ *ActiveFairShares*` where
       * `*ActiveFairShares*` is the number of active fair share identifiers.
       *
       * For example, a `computeReservation` value of 50 indicates that AWS Batch reserves 50% of
       * the maximum available vCPU if there's only one fair share identifier. It reserves 25% if there
       * are two fair share identifiers. It reserves 12.5% if there are three fair share identifiers. A
       * `computeReservation` value of 25 indicates that AWS Batch should reserve 25% of the maximum
       * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
       * identifiers, and 1.56% if there are three fair share identifiers.
       *
       * The minimum value is 0 and the maximum value is 99.
       */
      override fun computeReservation(computeReservation: Number) {
        cdkBuilder.computeReservation(computeReservation)
      }

      /**
       * @param shareDecaySeconds The amount of time (in seconds) to use to calculate a fair share
       * percentage for each fair share identifier in use.
       * A value of zero (0) indicates that only current usage is measured. The decay allows for
       * more recently run jobs to have more weight than jobs that ran earlier. The maximum supported
       * value is 604800 (1 week).
       */
      override fun shareDecaySeconds(shareDecaySeconds: Number) {
        cdkBuilder.shareDecaySeconds(shareDecaySeconds)
      }

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      override fun shareDistribution(shareDistribution: IResolvable) {
        cdkBuilder.shareDistribution(shareDistribution.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      override fun shareDistribution(shareDistribution: List<Any>) {
        cdkBuilder.shareDistribution(shareDistribution.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights
       * for the fair share identifiers for the fair share policy.
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       */
      override fun shareDistribution(vararg shareDistribution: Any): Unit =
          shareDistribution(shareDistribution.toList())

      public fun build():
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty,
    ) : CdkObject(cdkObject), FairsharePolicyProperty {
      /**
       * A value used to reserve some of the available maximum vCPU for fair share identifiers that
       * aren't already used.
       *
       * The reserved ratio is `( *computeReservation* /100)^ *ActiveFairShares*` where
       * `*ActiveFairShares*` is the number of active fair share identifiers.
       *
       * For example, a `computeReservation` value of 50 indicates that AWS Batch reserves 50% of
       * the maximum available vCPU if there's only one fair share identifier. It reserves 25% if there
       * are two fair share identifiers. It reserves 12.5% if there are three fair share identifiers. A
       * `computeReservation` value of 25 indicates that AWS Batch should reserve 25% of the maximum
       * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
       * identifiers, and 1.56% if there are three fair share identifiers.
       *
       * The minimum value is 0 and the maximum value is 99.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-computereservation)
       */
      override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

      /**
       * The amount of time (in seconds) to use to calculate a fair share percentage for each fair
       * share identifier in use.
       *
       * A value of zero (0) indicates that only current usage is measured. The decay allows for
       * more recently run jobs to have more weight than jobs that ran earlier. The maximum supported
       * value is 604800 (1 week).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-sharedecayseconds)
       */
      override fun shareDecaySeconds(): Number? = unwrap(this).getShareDecaySeconds()

      /**
       * An array of `SharedIdentifier` objects that contain the weights for the fair share
       * identifiers for the fair share policy.
       *
       * Fair share identifiers that aren't included have a default weight of `1.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html#cfn-batch-schedulingpolicy-fairsharepolicy-sharedistribution)
       */
      override fun shareDistribution(): Any? = unwrap(this).getShareDistribution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FairsharePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty):
          FairsharePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? FairsharePolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FairsharePolicyProperty):
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty
    }
  }

  /**
   * Specifies the weights for the fair share identifiers for the fair share policy.
   *
   * Fair share identifiers that aren't included have a default weight of `1.0` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * ShareAttributesProperty shareAttributesProperty = ShareAttributesProperty.builder()
   * .shareIdentifier("shareIdentifier")
   * .weightFactor(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html)
   */
  public interface ShareAttributesProperty {
    /**
     * A fair share identifier or fair share identifier prefix.
     *
     * If the string ends with an asterisk (*), this entry specifies the weight factor to use for
     * fair share identifiers that start with that prefix. The list of fair share identifiers in a fair
     * share policy can't overlap. For example, you can't have one that specifies a `shareIdentifier`
     * of `UserA*` and another that specifies a `shareIdentifier` of `UserA-1` .
     *
     * There can be no more than 500 fair share identifiers active in a job queue.
     *
     * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html#cfn-batch-schedulingpolicy-shareattributes-shareidentifier)
     */
    public fun shareIdentifier(): String? = unwrap(this).getShareIdentifier()

    /**
     * The weight factor for the fair share identifier.
     *
     * The default value is 1.0. A lower value has a higher priority for compute resources. For
     * example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the
     * compute resources of jobs that use a share identifier with a weight factor of 1.
     *
     * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html#cfn-batch-schedulingpolicy-shareattributes-weightfactor)
     */
    public fun weightFactor(): Number? = unwrap(this).getWeightFactor()

    /**
     * A builder for [ShareAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param shareIdentifier A fair share identifier or fair share identifier prefix.
       * If the string ends with an asterisk (*), this entry specifies the weight factor to use for
       * fair share identifiers that start with that prefix. The list of fair share identifiers in a
       * fair share policy can't overlap. For example, you can't have one that specifies a
       * `shareIdentifier` of `UserA*` and another that specifies a `shareIdentifier` of `UserA-1` .
       *
       * There can be no more than 500 fair share identifiers active in a job queue.
       *
       * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk
       * (*).
       */
      public fun shareIdentifier(shareIdentifier: String)

      /**
       * @param weightFactor The weight factor for the fair share identifier.
       * The default value is 1.0. A lower value has a higher priority for compute resources. For
       * example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the
       * compute resources of jobs that use a share identifier with a weight factor of 1.
       *
       * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
       */
      public fun weightFactor(weightFactor: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty.builder()

      /**
       * @param shareIdentifier A fair share identifier or fair share identifier prefix.
       * If the string ends with an asterisk (*), this entry specifies the weight factor to use for
       * fair share identifiers that start with that prefix. The list of fair share identifiers in a
       * fair share policy can't overlap. For example, you can't have one that specifies a
       * `shareIdentifier` of `UserA*` and another that specifies a `shareIdentifier` of `UserA-1` .
       *
       * There can be no more than 500 fair share identifiers active in a job queue.
       *
       * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk
       * (*).
       */
      override fun shareIdentifier(shareIdentifier: String) {
        cdkBuilder.shareIdentifier(shareIdentifier)
      }

      /**
       * @param weightFactor The weight factor for the fair share identifier.
       * The default value is 1.0. A lower value has a higher priority for compute resources. For
       * example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the
       * compute resources of jobs that use a share identifier with a weight factor of 1.
       *
       * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
       */
      override fun weightFactor(weightFactor: Number) {
        cdkBuilder.weightFactor(weightFactor)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty,
    ) : CdkObject(cdkObject), ShareAttributesProperty {
      /**
       * A fair share identifier or fair share identifier prefix.
       *
       * If the string ends with an asterisk (*), this entry specifies the weight factor to use for
       * fair share identifiers that start with that prefix. The list of fair share identifiers in a
       * fair share policy can't overlap. For example, you can't have one that specifies a
       * `shareIdentifier` of `UserA*` and another that specifies a `shareIdentifier` of `UserA-1` .
       *
       * There can be no more than 500 fair share identifiers active in a job queue.
       *
       * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk
       * (*).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html#cfn-batch-schedulingpolicy-shareattributes-shareidentifier)
       */
      override fun shareIdentifier(): String? = unwrap(this).getShareIdentifier()

      /**
       * The weight factor for the fair share identifier.
       *
       * The default value is 1.0. A lower value has a higher priority for compute resources. For
       * example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the
       * compute resources of jobs that use a share identifier with a weight factor of 1.
       *
       * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html#cfn-batch-schedulingpolicy-shareattributes-weightfactor)
       */
      override fun weightFactor(): Number? = unwrap(this).getWeightFactor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShareAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty):
          ShareAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? ShareAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShareAttributesProperty):
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty
    }
  }
}
