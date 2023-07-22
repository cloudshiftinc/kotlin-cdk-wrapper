@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnWorkGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkGroup.Builder = CfnWorkGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The workgroup description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description)
   * @param description The workgroup description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The workgroup name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name)
   * @param name The workgroup name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   *
   * The default is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
   * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
   * workgroup contains any named queries. 
   */
  public fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
    cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
  }

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   *
   * The default is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
   * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
   * workgroup contains any named queries. 
   */
  public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
    cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
  }

  /**
   * The state of the workgroup: ENABLED or DISABLED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state)
   * @param state The state of the workgroup: ENABLED or DISABLED. 
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * The tags (key-value pairs) to associate with this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
   * @param tags The tags (key-value pairs) to associate with this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags (key-value pairs) to associate with this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
   * @param tags The tags (key-value pairs) to associate with this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   *
   * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
   * client-side query settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
   * @param workGroupConfiguration The configuration of the workgroup, which includes the location
   * in Amazon S3 where query results are stored, the encryption option, if any, used for query
   * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
   * amount of bytes scanned (cutoff) per query, if it is specified. 
   */
  public fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
    cdkBuilder.workGroupConfiguration(workGroupConfiguration)
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   *
   * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
   * client-side query settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
   * @param workGroupConfiguration The configuration of the workgroup, which includes the location
   * in Amazon S3 where query results are stored, the encryption option, if any, used for query
   * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
   * amount of bytes scanned (cutoff) per query, if it is specified. 
   */
  public
      fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty) {
    cdkBuilder.workGroupConfiguration(workGroupConfiguration)
  }

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
   * @deprecated this property has been deprecated
   * @param workGroupConfigurationUpdates The configuration information that will be updated for
   * this workgroup, which includes the location in Amazon S3 where query results are stored, the
   * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
   * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
   * the data usage limit for the amount of bytes scanned per query, if it is specified. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
    cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates)
  }

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
   * @deprecated this property has been deprecated
   * @param workGroupConfigurationUpdates The configuration information that will be updated for
   * this workgroup, which includes the location in Amazon S3 where query results are stored, the
   * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
   * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
   * the data usage limit for the amount of bytes scanned per query, if it is specified. 
   */
  @Deprecated(message = "deprecated in CDK")
  public
      fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty) {
    cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates)
  }

  public fun build(): CfnWorkGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
