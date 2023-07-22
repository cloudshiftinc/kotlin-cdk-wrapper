@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

@CdkDslMarker
public class CfnConfigurationRecorderRecordingGroupPropertyDsl {
  private val cdkBuilder: CfnConfigurationRecorder.RecordingGroupProperty.Builder =
      CfnConfigurationRecorder.RecordingGroupProperty.builder()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  /**
   * @param allSupported Specifies whether AWS Config records configuration changes for all
   * supported regional resource types.
   * If you set this field to `true` , when AWS Config adds support for a new type of regional
   * resource, AWS Config starts recording resources of that type automatically.
   *
   * If you set this field to `true` , you cannot enumerate specific resource types to record in the
   * `resourceTypes` field of
   * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html) ,
   * or to exclude in the `resourceTypes` field of
   * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
   * .
   */
  public fun allSupported(allSupported: Boolean) {
    cdkBuilder.allSupported(allSupported)
  }

  /**
   * @param allSupported Specifies whether AWS Config records configuration changes for all
   * supported regional resource types.
   * If you set this field to `true` , when AWS Config adds support for a new type of regional
   * resource, AWS Config starts recording resources of that type automatically.
   *
   * If you set this field to `true` , you cannot enumerate specific resource types to record in the
   * `resourceTypes` field of
   * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html) ,
   * or to exclude in the `resourceTypes` field of
   * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
   * .
   */
  public fun allSupported(allSupported: IResolvable) {
    cdkBuilder.allSupported(allSupported)
  }

  /**
   * @param includeGlobalResourceTypes Specifies whether AWS Config includes all supported types of
   * global resources (for example, IAM resources) with the resources that it records.
   * Before you can set this option to `true` , you must set the `AllSupported` option to `true` .
   *
   * If you set this option to `true` , when AWS Config adds support for a new type of global
   * resource, it starts recording resources of that type automatically.
   *
   * The configuration details for any global resource are the same in all regions. To prevent
   * duplicate configuration items, you should consider customizing AWS Config in only one region to
   * record global resources.
   */
  public fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
    cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
  }

  /**
   * @param includeGlobalResourceTypes Specifies whether AWS Config includes all supported types of
   * global resources (for example, IAM resources) with the resources that it records.
   * Before you can set this option to `true` , you must set the `AllSupported` option to `true` .
   *
   * If you set this option to `true` , when AWS Config adds support for a new type of global
   * resource, it starts recording resources of that type automatically.
   *
   * The configuration details for any global resource are the same in all regions. To prevent
   * duplicate configuration items, you should consider customizing AWS Config in only one region to
   * record global resources.
   */
  public fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
    cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
  }

  /**
   * @param resourceTypes A comma-separated list that specifies the types of AWS resources for which
   * AWS Config records configuration changes (for example, `AWS::EC2::Instance` or
   * `AWS::CloudTrail::Trail` ).
   * To record all configuration changes, you must set the `AllSupported` option to `false` .
   *
   * If you set the `AllSupported` option to false and populate the `ResourceTypes` option with
   * values, when AWS Config adds support for a new type of resource, it will not record resources of
   * that type unless you manually add that type to your recording group.
   *
   * For a list of valid `resourceTypes` values, see the *resourceType Value* column in [Supported
   * AWS Resource
   * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
   * .
   */
  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  /**
   * @param resourceTypes A comma-separated list that specifies the types of AWS resources for which
   * AWS Config records configuration changes (for example, `AWS::EC2::Instance` or
   * `AWS::CloudTrail::Trail` ).
   * To record all configuration changes, you must set the `AllSupported` option to `false` .
   *
   * If you set the `AllSupported` option to false and populate the `ResourceTypes` option with
   * values, when AWS Config adds support for a new type of resource, it will not record resources of
   * that type unless you manually add that type to your recording group.
   *
   * For a list of valid `resourceTypes` values, see the *resourceType Value* column in [Supported
   * AWS Resource
   * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
   * .
   */
  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  public fun build(): CfnConfigurationRecorder.RecordingGroupProperty {
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    return cdkBuilder.build()
  }
}
