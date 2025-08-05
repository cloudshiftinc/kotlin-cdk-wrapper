@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAccountPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnAccountPolicyProps cfnAccountPolicyProps = CfnAccountPolicyProps.builder()
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .scope("scope")
 * .selectionCriteria("selectionCriteria")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html)
 */
public interface CfnAccountPolicyProps {
  /**
   * Specify the policy, in JSON.
   *
   * *Data protection policy*
   *
   * A data protection policy must include two JSON blocks:
   *
   * * The first block must include both a `DataIdentifer` array and an `Operation` property with an
   * `Audit` action. The `DataIdentifer` array lists the types of sensitive data that you want to mask.
   * For more information about the available options, see [Types of data that you can
   * mask](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html)
   * .
   *
   * The `Operation` property with an `Audit` action is required to find the sensitive data terms.
   * This `Audit` action must contain a `FindingsDestination` object. You can optionally use that
   * `FindingsDestination` object to list one or more destinations to send audit findings to. If you
   * specify destinations such as log groups, Firehose streams, and S3 buckets, they must already
   * exist.
   *
   * * The second block must include both a `DataIdentifer` array and an `Operation` property with
   * an `Deidentify` action. The `DataIdentifer` array must exactly match the `DataIdentifer` array in
   * the first block of the policy.
   *
   * The `Operation` property with the `Deidentify` action is what actually masks the data, and it
   * must contain the `"MaskConfig": {}` object. The `"MaskConfig": {}` object must be empty.
   *
   *
   * The contents of the two `DataIdentifer` arrays must match exactly.
   *
   *
   * In addition to the two JSON blocks, the `policyDocument` can also include `Name` ,
   * `Description` , and `Version` fields. The `Name` is different than the operation's `policyName`
   * parameter, and is used as a dimension when CloudWatch Logs reports audit findings metrics to
   * CloudWatch .
   *
   * The JSON specified in `policyDocument` can be up to 30,720 characters long.
   *
   * *Subscription filter policy*
   *
   * A subscription filter policy can include the following attributes in a JSON block:
   *
   * * *DestinationArn* The ARN of the destination to deliver log events to. Supported destinations
   * are:
   * * An Kinesis Data Streams data stream in the same account as the subscription policy, for
   * same-account delivery.
   * * An Firehose data stream in the same account as the subscription policy, for same-account
   * delivery.
   * * A Lambda function in the same account as the subscription policy, for same-account delivery.
   * * A logical destination in a different account created with
   * [PutDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html)
   * , for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
   * destinations.
   * * *RoleArn* The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested
   * log events to the destination stream. You don't need to provide the ARN when you are working with
   * a logical destination for cross-account delivery.
   * * *FilterPattern* A filter pattern for subscribing to a filtered stream of log events.
   * * *Distribution* The method used to distribute log data to the destination. By default, log
   * data is grouped by log stream, but the grouping can be set to `Random` for a more even
   * distribution. This property is only applicable when the destination is an Kinesis Data Streams
   * data stream.
   *
   * *Field index policy*
   *
   * A field index filter policy can include the following attribute in a JSON block:
   *
   * * *Fields* The array of field indexes to create.
   *
   * The following is an example of an index policy document that creates two indexes, `RequestId`
   * and `TransactionId` .
   *
   * `"policyDocument": "{ \"Fields\": [ \"RequestId\", \"TransactionId\" ] }"`
   *
   * *Transformer policy*
   *
   * A transformer policy must include one JSON block with the array of processors and their
   * configurations. For more information about available processors, see [Processors that you can
   * use](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-Processors)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policydocument)
   */
  public fun policyDocument(): String

  /**
   * A name for the policy.
   *
   * This must be unique within the account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policyname)
   */
  public fun policyName(): String

  /**
   * The type of policy that you're creating or updating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policytype)
   */
  public fun policyType(): String

  /**
   * Currently the only valid value for this parameter is `ALL` , which specifies that the policy
   * applies to all log groups in the account.
   *
   * If you omit this parameter, the default of `ALL` is used. To scope down a subscription filter
   * policy to a subset of log groups, use the `SelectionCriteria` parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-scope)
   */
  public fun scope(): String? = unwrap(this).getScope()

  /**
   * Use this parameter to apply the new policy to a subset of log groups in the account.
   *
   * You need to specify `SelectionCriteria` only when you specify `SUBSCRIPTION_FILTER_POLICY` ,
   * `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` for `PolicyType` .
   *
   * If `PolicyType` is `SUBSCRIPTION_FILTER_POLICY` , the only supported `SelectionCriteria` filter
   * is `LogGroupName NOT IN []`
   *
   * If `PolicyType` is `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` , the only supported
   * `SelectionCriteria` filter is `LogGroupNamePrefix`
   *
   * The `SelectionCriteria` string can be up to 25KB in length. The length is determined by using
   * its UTF-8 bytes.
   *
   * Using the `SelectionCriteria` parameter with `SUBSCRIPTION_FILTER_POLICY` is useful to help
   * prevent infinite loops. For more information, see [Log recursion
   * prevention](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Subscriptions-recursion-prevention.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-selectioncriteria)
   */
  public fun selectionCriteria(): String? = unwrap(this).getSelectionCriteria()

  /**
   * A builder for [CfnAccountPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument Specify the policy, in JSON. 
     * *Data protection policy*
     *
     * A data protection policy must include two JSON blocks:
     *
     * * The first block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Audit` action. The `DataIdentifer` array lists the types of sensitive data that you want to
     * mask. For more information about the available options, see [Types of data that you can
     * mask](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html)
     * .
     *
     * The `Operation` property with an `Audit` action is required to find the sensitive data terms.
     * This `Audit` action must contain a `FindingsDestination` object. You can optionally use that
     * `FindingsDestination` object to list one or more destinations to send audit findings to. If you
     * specify destinations such as log groups, Firehose streams, and S3 buckets, they must already
     * exist.
     *
     * * The second block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Deidentify` action. The `DataIdentifer` array must exactly match the `DataIdentifer` array
     * in the first block of the policy.
     *
     * The `Operation` property with the `Deidentify` action is what actually masks the data, and it
     * must contain the `"MaskConfig": {}` object. The `"MaskConfig": {}` object must be empty.
     *
     *
     * The contents of the two `DataIdentifer` arrays must match exactly.
     *
     *
     * In addition to the two JSON blocks, the `policyDocument` can also include `Name` ,
     * `Description` , and `Version` fields. The `Name` is different than the operation's `policyName`
     * parameter, and is used as a dimension when CloudWatch Logs reports audit findings metrics to
     * CloudWatch .
     *
     * The JSON specified in `policyDocument` can be up to 30,720 characters long.
     *
     * *Subscription filter policy*
     *
     * A subscription filter policy can include the following attributes in a JSON block:
     *
     * * *DestinationArn* The ARN of the destination to deliver log events to. Supported
     * destinations are:
     * * An Kinesis Data Streams data stream in the same account as the subscription policy, for
     * same-account delivery.
     * * An Firehose data stream in the same account as the subscription policy, for same-account
     * delivery.
     * * A Lambda function in the same account as the subscription policy, for same-account
     * delivery.
     * * A logical destination in a different account created with
     * [PutDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html)
     * , for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
     * destinations.
     * * *RoleArn* The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide the ARN when you are
     * working with a logical destination for cross-account delivery.
     * * *FilterPattern* A filter pattern for subscribing to a filtered stream of log events.
     * * *Distribution* The method used to distribute log data to the destination. By default, log
     * data is grouped by log stream, but the grouping can be set to `Random` for a more even
     * distribution. This property is only applicable when the destination is an Kinesis Data Streams
     * data stream.
     *
     * *Field index policy*
     *
     * A field index filter policy can include the following attribute in a JSON block:
     *
     * * *Fields* The array of field indexes to create.
     *
     * The following is an example of an index policy document that creates two indexes, `RequestId`
     * and `TransactionId` .
     *
     * `"policyDocument": "{ \"Fields\": [ \"RequestId\", \"TransactionId\" ] }"`
     *
     * *Transformer policy*
     *
     * A transformer policy must include one JSON block with the array of processors and their
     * configurations. For more information about available processors, see [Processors that you can
     * use](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-Processors)
     * .
     */
    public fun policyDocument(policyDocument: String)

    /**
     * @param policyName A name for the policy. 
     * This must be unique within the account.
     */
    public fun policyName(policyName: String)

    /**
     * @param policyType The type of policy that you're creating or updating. 
     */
    public fun policyType(policyType: String)

    /**
     * @param scope Currently the only valid value for this parameter is `ALL` , which specifies
     * that the policy applies to all log groups in the account.
     * If you omit this parameter, the default of `ALL` is used. To scope down a subscription filter
     * policy to a subset of log groups, use the `SelectionCriteria` parameter.
     */
    public fun scope(scope: String)

    /**
     * @param selectionCriteria Use this parameter to apply the new policy to a subset of log groups
     * in the account.
     * You need to specify `SelectionCriteria` only when you specify `SUBSCRIPTION_FILTER_POLICY` ,
     * `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` for `PolicyType` .
     *
     * If `PolicyType` is `SUBSCRIPTION_FILTER_POLICY` , the only supported `SelectionCriteria`
     * filter is `LogGroupName NOT IN []`
     *
     * If `PolicyType` is `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` , the only supported
     * `SelectionCriteria` filter is `LogGroupNamePrefix`
     *
     * The `SelectionCriteria` string can be up to 25KB in length. The length is determined by using
     * its UTF-8 bytes.
     *
     * Using the `SelectionCriteria` parameter with `SUBSCRIPTION_FILTER_POLICY` is useful to help
     * prevent infinite loops. For more information, see [Log recursion
     * prevention](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Subscriptions-recursion-prevention.html)
     * .
     */
    public fun selectionCriteria(selectionCriteria: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnAccountPolicyProps.Builder =
        software.amazon.awscdk.services.logs.CfnAccountPolicyProps.builder()

    /**
     * @param policyDocument Specify the policy, in JSON. 
     * *Data protection policy*
     *
     * A data protection policy must include two JSON blocks:
     *
     * * The first block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Audit` action. The `DataIdentifer` array lists the types of sensitive data that you want to
     * mask. For more information about the available options, see [Types of data that you can
     * mask](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html)
     * .
     *
     * The `Operation` property with an `Audit` action is required to find the sensitive data terms.
     * This `Audit` action must contain a `FindingsDestination` object. You can optionally use that
     * `FindingsDestination` object to list one or more destinations to send audit findings to. If you
     * specify destinations such as log groups, Firehose streams, and S3 buckets, they must already
     * exist.
     *
     * * The second block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Deidentify` action. The `DataIdentifer` array must exactly match the `DataIdentifer` array
     * in the first block of the policy.
     *
     * The `Operation` property with the `Deidentify` action is what actually masks the data, and it
     * must contain the `"MaskConfig": {}` object. The `"MaskConfig": {}` object must be empty.
     *
     *
     * The contents of the two `DataIdentifer` arrays must match exactly.
     *
     *
     * In addition to the two JSON blocks, the `policyDocument` can also include `Name` ,
     * `Description` , and `Version` fields. The `Name` is different than the operation's `policyName`
     * parameter, and is used as a dimension when CloudWatch Logs reports audit findings metrics to
     * CloudWatch .
     *
     * The JSON specified in `policyDocument` can be up to 30,720 characters long.
     *
     * *Subscription filter policy*
     *
     * A subscription filter policy can include the following attributes in a JSON block:
     *
     * * *DestinationArn* The ARN of the destination to deliver log events to. Supported
     * destinations are:
     * * An Kinesis Data Streams data stream in the same account as the subscription policy, for
     * same-account delivery.
     * * An Firehose data stream in the same account as the subscription policy, for same-account
     * delivery.
     * * A Lambda function in the same account as the subscription policy, for same-account
     * delivery.
     * * A logical destination in a different account created with
     * [PutDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html)
     * , for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
     * destinations.
     * * *RoleArn* The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide the ARN when you are
     * working with a logical destination for cross-account delivery.
     * * *FilterPattern* A filter pattern for subscribing to a filtered stream of log events.
     * * *Distribution* The method used to distribute log data to the destination. By default, log
     * data is grouped by log stream, but the grouping can be set to `Random` for a more even
     * distribution. This property is only applicable when the destination is an Kinesis Data Streams
     * data stream.
     *
     * *Field index policy*
     *
     * A field index filter policy can include the following attribute in a JSON block:
     *
     * * *Fields* The array of field indexes to create.
     *
     * The following is an example of an index policy document that creates two indexes, `RequestId`
     * and `TransactionId` .
     *
     * `"policyDocument": "{ \"Fields\": [ \"RequestId\", \"TransactionId\" ] }"`
     *
     * *Transformer policy*
     *
     * A transformer policy must include one JSON block with the array of processors and their
     * configurations. For more information about available processors, see [Processors that you can
     * use](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-Processors)
     * .
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName A name for the policy. 
     * This must be unique within the account.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param policyType The type of policy that you're creating or updating. 
     */
    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    /**
     * @param scope Currently the only valid value for this parameter is `ALL` , which specifies
     * that the policy applies to all log groups in the account.
     * If you omit this parameter, the default of `ALL` is used. To scope down a subscription filter
     * policy to a subset of log groups, use the `SelectionCriteria` parameter.
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param selectionCriteria Use this parameter to apply the new policy to a subset of log groups
     * in the account.
     * You need to specify `SelectionCriteria` only when you specify `SUBSCRIPTION_FILTER_POLICY` ,
     * `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` for `PolicyType` .
     *
     * If `PolicyType` is `SUBSCRIPTION_FILTER_POLICY` , the only supported `SelectionCriteria`
     * filter is `LogGroupName NOT IN []`
     *
     * If `PolicyType` is `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` , the only supported
     * `SelectionCriteria` filter is `LogGroupNamePrefix`
     *
     * The `SelectionCriteria` string can be up to 25KB in length. The length is determined by using
     * its UTF-8 bytes.
     *
     * Using the `SelectionCriteria` parameter with `SUBSCRIPTION_FILTER_POLICY` is useful to help
     * prevent infinite loops. For more information, see [Log recursion
     * prevention](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Subscriptions-recursion-prevention.html)
     * .
     */
    override fun selectionCriteria(selectionCriteria: String) {
      cdkBuilder.selectionCriteria(selectionCriteria)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnAccountPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicyProps,
  ) : CdkObject(cdkObject),
      CfnAccountPolicyProps {
    /**
     * Specify the policy, in JSON.
     *
     * *Data protection policy*
     *
     * A data protection policy must include two JSON blocks:
     *
     * * The first block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Audit` action. The `DataIdentifer` array lists the types of sensitive data that you want to
     * mask. For more information about the available options, see [Types of data that you can
     * mask](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html)
     * .
     *
     * The `Operation` property with an `Audit` action is required to find the sensitive data terms.
     * This `Audit` action must contain a `FindingsDestination` object. You can optionally use that
     * `FindingsDestination` object to list one or more destinations to send audit findings to. If you
     * specify destinations such as log groups, Firehose streams, and S3 buckets, they must already
     * exist.
     *
     * * The second block must include both a `DataIdentifer` array and an `Operation` property with
     * an `Deidentify` action. The `DataIdentifer` array must exactly match the `DataIdentifer` array
     * in the first block of the policy.
     *
     * The `Operation` property with the `Deidentify` action is what actually masks the data, and it
     * must contain the `"MaskConfig": {}` object. The `"MaskConfig": {}` object must be empty.
     *
     *
     * The contents of the two `DataIdentifer` arrays must match exactly.
     *
     *
     * In addition to the two JSON blocks, the `policyDocument` can also include `Name` ,
     * `Description` , and `Version` fields. The `Name` is different than the operation's `policyName`
     * parameter, and is used as a dimension when CloudWatch Logs reports audit findings metrics to
     * CloudWatch .
     *
     * The JSON specified in `policyDocument` can be up to 30,720 characters long.
     *
     * *Subscription filter policy*
     *
     * A subscription filter policy can include the following attributes in a JSON block:
     *
     * * *DestinationArn* The ARN of the destination to deliver log events to. Supported
     * destinations are:
     * * An Kinesis Data Streams data stream in the same account as the subscription policy, for
     * same-account delivery.
     * * An Firehose data stream in the same account as the subscription policy, for same-account
     * delivery.
     * * A Lambda function in the same account as the subscription policy, for same-account
     * delivery.
     * * A logical destination in a different account created with
     * [PutDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html)
     * , for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
     * destinations.
     * * *RoleArn* The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. You don't need to provide the ARN when you are
     * working with a logical destination for cross-account delivery.
     * * *FilterPattern* A filter pattern for subscribing to a filtered stream of log events.
     * * *Distribution* The method used to distribute log data to the destination. By default, log
     * data is grouped by log stream, but the grouping can be set to `Random` for a more even
     * distribution. This property is only applicable when the destination is an Kinesis Data Streams
     * data stream.
     *
     * *Field index policy*
     *
     * A field index filter policy can include the following attribute in a JSON block:
     *
     * * *Fields* The array of field indexes to create.
     *
     * The following is an example of an index policy document that creates two indexes, `RequestId`
     * and `TransactionId` .
     *
     * `"policyDocument": "{ \"Fields\": [ \"RequestId\", \"TransactionId\" ] }"`
     *
     * *Transformer policy*
     *
     * A transformer policy must include one JSON block with the array of processors and their
     * configurations. For more information about available processors, see [Processors that you can
     * use](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-Processors)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policydocument)
     */
    override fun policyDocument(): String = unwrap(this).getPolicyDocument()

    /**
     * A name for the policy.
     *
     * This must be unique within the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * The type of policy that you're creating or updating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-policytype)
     */
    override fun policyType(): String = unwrap(this).getPolicyType()

    /**
     * Currently the only valid value for this parameter is `ALL` , which specifies that the policy
     * applies to all log groups in the account.
     *
     * If you omit this parameter, the default of `ALL` is used. To scope down a subscription filter
     * policy to a subset of log groups, use the `SelectionCriteria` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-scope)
     */
    override fun scope(): String? = unwrap(this).getScope()

    /**
     * Use this parameter to apply the new policy to a subset of log groups in the account.
     *
     * You need to specify `SelectionCriteria` only when you specify `SUBSCRIPTION_FILTER_POLICY` ,
     * `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` for `PolicyType` .
     *
     * If `PolicyType` is `SUBSCRIPTION_FILTER_POLICY` , the only supported `SelectionCriteria`
     * filter is `LogGroupName NOT IN []`
     *
     * If `PolicyType` is `FIELD_INDEX_POLICY` or `TRANSFORMER_POLICY` , the only supported
     * `SelectionCriteria` filter is `LogGroupNamePrefix`
     *
     * The `SelectionCriteria` string can be up to 25KB in length. The length is determined by using
     * its UTF-8 bytes.
     *
     * Using the `SelectionCriteria` parameter with `SUBSCRIPTION_FILTER_POLICY` is useful to help
     * prevent infinite loops. For more information, see [Log recursion
     * prevention](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Subscriptions-recursion-prevention.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html#cfn-logs-accountpolicy-selectioncriteria)
     */
    override fun selectionCriteria(): String? = unwrap(this).getSelectionCriteria()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicyProps):
        CfnAccountPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccountPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountPolicyProps):
        software.amazon.awscdk.services.logs.CfnAccountPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnAccountPolicyProps
  }
}
