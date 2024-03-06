@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.CfnTrail

/**
 * A single selector statement in an advanced event selector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * AdvancedFieldSelectorProperty advancedFieldSelectorProperty =
 * AdvancedFieldSelectorProperty.builder()
 * .field("field")
 * // the properties below are optional
 * .endsWith(List.of("endsWith"))
 * .equalTo(List.of("equalTo"))
 * .notEndsWith(List.of("notEndsWith"))
 * .notEquals(List.of("notEquals"))
 * .notStartsWith(List.of("notStartsWith"))
 * .startsWith(List.of("startsWith"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html)
 */
@CdkDslMarker
public class CfnTrailAdvancedFieldSelectorPropertyDsl {
    private val cdkBuilder: CfnTrail.AdvancedFieldSelectorProperty.Builder =
        CfnTrail.AdvancedFieldSelectorProperty.builder()

    private val _endsWith: MutableList<String> = mutableListOf()

    private val _equalTo: MutableList<String> = mutableListOf()

    private val _notEndsWith: MutableList<String> = mutableListOf()

    private val _notEquals: MutableList<String> = mutableListOf()

    private val _notStartsWith: MutableList<String> = mutableListOf()

    private val _startsWith: MutableList<String> = mutableListOf()

    /**
     * @param endsWith An operator that includes events that match the last few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun endsWith(vararg endsWith: String) {
        _endsWith.addAll(listOf(*endsWith))
    }

    /**
     * @param endsWith An operator that includes events that match the last few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun endsWith(endsWith: Collection<String>) {
        _endsWith.addAll(endsWith)
    }

    /**
     * @param equalTo An operator that includes events that match the exact value of the event
     *   record field specified as the value of `Field` . This is the only valid operator that you
     *   can use with the `readOnly` , `eventCategory` , and `resources.type` fields.
     */
    public fun equalTo(vararg equalTo: String) {
        _equalTo.addAll(listOf(*equalTo))
    }

    /**
     * @param equalTo An operator that includes events that match the exact value of the event
     *   record field specified as the value of `Field` . This is the only valid operator that you
     *   can use with the `readOnly` , `eventCategory` , and `resources.type` fields.
     */
    public fun equalTo(equalTo: Collection<String>) {
        _equalTo.addAll(equalTo)
    }

    /**
     * @param field A field in a CloudTrail event record on which to filter events to be logged. For
     *   event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     *   Manager evidence, or events outside of AWS , the field is used only for selecting events as
     *   filtering is not supported.
     *
     * For CloudTrail management events, supported fields include `readOnly` , `eventCategory` , and
     * `eventSource` .
     *
     * For CloudTrail data events, supported fields include `readOnly` , `eventCategory` ,
     * `eventName` , `resources.type` , and `resources.ARN` .
     *
     * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
     * * *`readOnly`* - Optional. Can be set to `Equals` a value of `true` or `false` . If you do
     *   not add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs
     *   only `read` events. A value of `false` logs only `write` events.
     * * *`eventSource`* - For filtering management events only. This can be set to `NotEquals`
     *   `kms.amazonaws.com` or `NotEquals` `rdsdata.amazonaws.com` .
     * * *`eventName`* - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *   event logged to CloudTrail, such as `PutBucket` or `GetSnapshotBlock` . You can have
     *   multiple values for this ﬁeld, separated by commas.
     * * *`eventCategory`* - This is required and must be set to `Equals` .
     * * For CloudTrail management events, the value must be `Management` .
     * * For CloudTrail data events, the value must be `Data` .
     *
     * The following are used only for event data stores:
     * * For CloudTrail Insights events, the value must be `Insight` .
     * * For AWS Config configuration items, the value must be `ConfigurationItem` .
     * * For Audit Manager evidence, the value must be `Evidence` .
     * * For non- AWS events, the value must be `ActivityAuditLog` .
     * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type` can
     *   only use the `Equals` operator, and the value can be one of the following:
     * * `AWS::DynamoDB::Table`
     * * `AWS::Lambda::Function`
     * * `AWS::S3::Object`
     * * `AWS::AppConfig::Configuration`
     * * `AWS::B2BI::Transformer`
     * * `AWS::Bedrock::AgentAlias`
     * * `AWS::Bedrock::KnowledgeBase`
     * * `AWS::Cassandra::Table`
     * * `AWS::CloudFront::KeyValueStore`
     * * `AWS::CloudTrail::Channel`
     * * `AWS::CodeWhisperer::Customization`
     * * `AWS::CodeWhisperer::Profile`
     * * `AWS::Cognito::IdentityPool`
     * * `AWS::DynamoDB::Stream`
     * * `AWS::EC2::Snapshot`
     * * `AWS::EMRWAL::Workspace`
     * * `AWS::FinSpace::Environment`
     * * `AWS::Glue::Table`
     * * `AWS::GreengrassV2::ComponentVersion`
     * * `AWS::GreengrassV2::Deployment`
     * * `AWS::GuardDuty::Detector`
     * * `AWS::IoT::Certificate`
     * * `AWS::IoT::Thing`
     * * `AWS::IoTSiteWise::Asset`
     * * `AWS::IoTSiteWise::TimeSeries`
     * * `AWS::IoTTwinMaker::Entity`
     * * `AWS::IoTTwinMaker::Workspace`
     * * `AWS::KendraRanking::ExecutionPlan`
     * * `AWS::KinesisVideo::Stream`
     * * `AWS::ManagedBlockchain::Network`
     * * `AWS::ManagedBlockchain::Node`
     * * `AWS::MedicalImaging::Datastore`
     * * `AWS::NeptuneGraph::Graph`
     * * `AWS::PCAConnectorAD::Connector`
     * * `AWS::QBusiness::Application`
     * * `AWS::QBusiness::DataSource`
     * * `AWS::QBusiness::Index`
     * * `AWS::QBusiness::WebExperience`
     * * `AWS::RDS::DBCluster`
     * * `AWS::S3::AccessPoint`
     * * `AWS::S3ObjectLambda::AccessPoint`
     * * `AWS::S3Outposts::Object`
     * * `AWS::SageMaker::Endpoint`
     * * `AWS::SageMaker::ExperimentTrialComponent`
     * * `AWS::SageMaker::FeatureGroup`
     * * `AWS::ServiceDiscovery::Namespace`
     * * `AWS::ServiceDiscovery::Service`
     * * `AWS::SCN::Instance`
     * * `AWS::SNS::PlatformEndpoint`
     * * `AWS::SNS::Topic`
     * * `AWS::SWF::Domain`
     * * `AWS::SQS::Queue`
     * * `AWS::SSMMessages::ControlChannel`
     * * `AWS::ThinClient::Device`
     * * `AWS::ThinClient::Environment`
     * * `AWS::Timestream::Database`
     * * `AWS::Timestream::Table`
     * * `AWS::VerifiedPermissions::PolicyStore`
     *
     * You can have only one `resources.type` ﬁeld per selector. To log data events on more than one
     * resource type, add another selector.
     * * *`resources.ARN`* - You can use any operator with `resources.ARN` , but if you use `Equals`
     *   or `NotEquals` , the value must exactly match the ARN of a valid resource of the type
     *   you've speciﬁed in the template as the value of resources.type. For example, if
     *   resources.type equals `AWS::S3::Object` , the ARN must be in one of the following formats.
     *   To log all data events for all objects in a specific S3 bucket, use the `StartsWith`
     *   operator, and include only the bucket ARN as the matching value.
     *
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and
     * greater than symbols (&lt;&gt;) with resource-specific information.
     * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/`
     * * `arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/`
     *
     * When resources.type equals `AWS::DynamoDB::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::Lambda::Function` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;`
     *
     * When resources.type equals `AWS::AppConfig::Configuration` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;`
     *
     * When resources.type equals `AWS::B2BI::Transformer` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;`
     *
     * When resources.type equals `AWS::Bedrock::AgentAlias` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;`
     *
     * When resources.type equals `AWS::Bedrock::KnowledgeBase` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;`
     *
     * When resources.type equals `AWS::Cassandra::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::CloudFront::KeyValueStore` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;`
     *
     * When resources.type equals `AWS::CloudTrail::Channel` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;`
     *
     * When resources.type equals `AWS::CodeWhisperer::Customization` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;`
     *
     * When resources.type equals `AWS::CodeWhisperer::Profile` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;`
     *
     * When resources.type equals `AWS::Cognito::IdentityPool` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;`
     *
     * When `resources.type` equals `AWS::DynamoDB::Stream` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;`
     *
     * When `resources.type` equals `AWS::EC2::Snapshot` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;`
     *
     * When `resources.type` equals `AWS::EMRWAL::Workspace` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;`
     *
     * When `resources.type` equals `AWS::FinSpace::Environment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
     *
     * When `resources.type` equals `AWS::Glue::Table` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;`
     *
     * When `resources.type` equals `AWS::GreengrassV2::ComponentVersion` , and the operator is set
     * to `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;`
     *
     * When `resources.type` equals `AWS::GreengrassV2::Deployment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID`
     *
     * When `resources.type` equals `AWS::GuardDuty::Detector` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoT::Certificate` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoT::Thing` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTSiteWise::Asset` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTSiteWise::TimeSeries` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTTwinMaker::Entity` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;`
     *
     * When `resources.type` equals `AWS::IoTTwinMaker::Workspace` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;`
     *
     * When `resources.type` equals `AWS::KendraRanking::ExecutionPlan` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;`
     *
     * When `resources.type` equals `AWS::KinesisVideo::Stream` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;`
     *
     * When `resources.type` equals `AWS::ManagedBlockchain::Network` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;`
     *
     * When `resources.type` equals `AWS::ManagedBlockchain::Node` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;`
     *
     * When `resources.type` equals `AWS::MedicalImaging::Datastore` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;`
     *
     * When `resources.type` equals `AWS::NeptuneGraph::Graph` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;`
     *
     * When `resources.type` equals `AWS::PCAConnectorAD::Connector` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::Application` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::DataSource` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::Index` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;`
     *
     * When `resources.type` equals `AWS::QBusiness::WebExperience` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;`
     *
     * When `resources.type` equals `AWS::RDS::DBCluster` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;`
     *
     * When `resources.type` equals `AWS::S3::AccessPoint` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in one of the following formats. To log events on all objects
     * in an S3 access point, we recommend that you use only the access point ARN, don’t include the
     * object path, and use the `StartsWith` or `NotStartsWith` operators.
     * *
     * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
     * *
     * `arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;`
     *
     * When `resources.type` equals `AWS::S3ObjectLambda::AccessPoint` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;`
     *
     * When `resources.type` equals `AWS::S3Outposts::Object` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::Endpoint` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::ExperimentTrialComponent` , and the operator is
     * set to `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;`
     *
     * When `resources.type` equals `AWS::SageMaker::FeatureGroup` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;`
     *
     * When `resources.type` equals `AWS::SCN::Instance` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;`
     *
     * When `resources.type` equals `AWS::ServiceDiscovery::Namespace` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;`
     *
     * When `resources.type` equals `AWS::ServiceDiscovery::Service` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;`
     *
     * When `resources.type` equals `AWS::SNS::PlatformEndpoint` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;`
     *
     * When `resources.type` equals `AWS::SNS::Topic` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;`
     *
     * When `resources.type` equals `AWS::SWF::Domain` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;`
     *
     * When `resources.type` equals `AWS::SQS::Queue` , and the operator is set to `Equals` or
     * `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;`
     *
     * When `resources.type` equals `AWS::SSMMessages::ControlChannel` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;`
     *
     * When `resources.type` equals `AWS::ThinClient::Device` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;`
     *
     * When `resources.type` equals `AWS::ThinClient::Environment` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;`
     *
     * When `resources.type` equals `AWS::Timestream::Database` , and the operator is set to
     * `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;`
     *
     * When `resources.type` equals `AWS::Timestream::Table` , and the operator is set to `Equals`
     * or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;`
     *
     * When resources.type equals `AWS::VerifiedPermissions::PolicyStore` , and the operator is set
     * to `Equals` or `NotEquals` , the ARN must be in the following format:
     * *
     * `arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;`
     */
    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    /**
     * @param notEndsWith An operator that excludes events that match the last few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun notEndsWith(vararg notEndsWith: String) {
        _notEndsWith.addAll(listOf(*notEndsWith))
    }

    /**
     * @param notEndsWith An operator that excludes events that match the last few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun notEndsWith(notEndsWith: Collection<String>) {
        _notEndsWith.addAll(notEndsWith)
    }

    /**
     * @param notEquals An operator that excludes events that match the exact value of the event
     *   record field specified as the value of `Field` .
     */
    public fun notEquals(vararg notEquals: String) {
        _notEquals.addAll(listOf(*notEquals))
    }

    /**
     * @param notEquals An operator that excludes events that match the exact value of the event
     *   record field specified as the value of `Field` .
     */
    public fun notEquals(notEquals: Collection<String>) {
        _notEquals.addAll(notEquals)
    }

    /**
     * @param notStartsWith An operator that excludes events that match the first few characters of
     *   the event record field specified as the value of `Field` .
     */
    public fun notStartsWith(vararg notStartsWith: String) {
        _notStartsWith.addAll(listOf(*notStartsWith))
    }

    /**
     * @param notStartsWith An operator that excludes events that match the first few characters of
     *   the event record field specified as the value of `Field` .
     */
    public fun notStartsWith(notStartsWith: Collection<String>) {
        _notStartsWith.addAll(notStartsWith)
    }

    /**
     * @param startsWith An operator that includes events that match the first few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun startsWith(vararg startsWith: String) {
        _startsWith.addAll(listOf(*startsWith))
    }

    /**
     * @param startsWith An operator that includes events that match the first few characters of the
     *   event record field specified as the value of `Field` .
     */
    public fun startsWith(startsWith: Collection<String>) {
        _startsWith.addAll(startsWith)
    }

    public fun build(): CfnTrail.AdvancedFieldSelectorProperty {
        if (_endsWith.isNotEmpty()) cdkBuilder.endsWith(_endsWith)
        if (_equalTo.isNotEmpty()) cdkBuilder.equalTo(_equalTo)
        if (_notEndsWith.isNotEmpty()) cdkBuilder.notEndsWith(_notEndsWith)
        if (_notEquals.isNotEmpty()) cdkBuilder.notEquals(_notEquals)
        if (_notStartsWith.isNotEmpty()) cdkBuilder.notStartsWith(_notStartsWith)
        if (_startsWith.isNotEmpty()) cdkBuilder.startsWith(_startsWith)
        return cdkBuilder.build()
    }
}
