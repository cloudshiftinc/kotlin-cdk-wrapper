@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  private val _initialCapacity: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The CPU architecture type of the application.
   *
   * Allowed values: `X86_64` or `ARM64`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
   * @param architecture The CPU architecture type of the application. 
   */
  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * The configuration for an application to automatically start on job submission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
   * @param autoStartConfiguration The configuration for an application to automatically start on
   * job submission. 
   */
  public fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
    cdkBuilder.autoStartConfiguration(autoStartConfiguration)
  }

  /**
   * The configuration for an application to automatically start on job submission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
   * @param autoStartConfiguration The configuration for an application to automatically start on
   * job submission. 
   */
  public
      fun autoStartConfiguration(autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty) {
    cdkBuilder.autoStartConfiguration(autoStartConfiguration)
  }

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
   * @param autoStopConfiguration The configuration for an application to automatically stop after a
   * certain amount of time being idle. 
   */
  public fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
    cdkBuilder.autoStopConfiguration(autoStopConfiguration)
  }

  /**
   * The configuration for an application to automatically stop after a certain amount of time being
   * idle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
   * @param autoStopConfiguration The configuration for an application to automatically stop after a
   * certain amount of time being idle. 
   */
  public
      fun autoStopConfiguration(autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty) {
    cdkBuilder.autoStopConfiguration(autoStopConfiguration)
  }

  /**
   * The image configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
   * @param imageConfiguration The image configuration. 
   */
  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  /**
   * The image configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
   * @param imageConfiguration The image configuration. 
   */
  public
      fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  /**
   * The initial capacity of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
   * @param initialCapacity The initial capacity of the application. 
   */
  public fun initialCapacity(vararg initialCapacity: Any) {
    _initialCapacity.addAll(listOf(*initialCapacity))
  }

  /**
   * The initial capacity of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
   * @param initialCapacity The initial capacity of the application. 
   */
  public fun initialCapacity(initialCapacity: Collection<Any>) {
    _initialCapacity.addAll(initialCapacity)
  }

  /**
   * The initial capacity of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
   * @param initialCapacity The initial capacity of the application. 
   */
  public fun initialCapacity(initialCapacity: IResolvable) {
    cdkBuilder.initialCapacity(initialCapacity)
  }

  /**
   * The maximum capacity of the application.
   *
   * This is cumulative across all workers at any given point in time during the lifespan of the
   * application is created. No new resources will be created once any one of the defined limits is
   * hit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
   * @param maximumCapacity The maximum capacity of the application. 
   */
  public fun maximumCapacity(maximumCapacity: IResolvable) {
    cdkBuilder.maximumCapacity(maximumCapacity)
  }

  /**
   * The maximum capacity of the application.
   *
   * This is cumulative across all workers at any given point in time during the lifespan of the
   * application is created. No new resources will be created once any one of the defined limits is
   * hit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
   * @param maximumCapacity The maximum capacity of the application. 
   */
  public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
    cdkBuilder.maximumCapacity(maximumCapacity)
  }

  /**
   * The name of the application.
   *
   * *Minimum* : 1
   *
   * *Maximum* : 64
   *
   * *Pattern* : `^[A-Za-z0-9._\\/#-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
   * @param name The name of the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The network configuration for customer VPC connectivity for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
   * @param networkConfiguration The network configuration for customer VPC connectivity for the
   * application. 
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * The network configuration for customer VPC connectivity for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
   * @param networkConfiguration The network configuration for customer VPC connectivity for the
   * application. 
   */
  public
      fun networkConfiguration(networkConfiguration: CfnApplication.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * The EMR release version associated with the application.
   *
   * *Minimum* : 1
   *
   * *Maximum* : 64
   *
   * *Pattern* : `^[A-Za-z0-9._/-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
   * @param releaseLabel The EMR release version associated with the application. 
   */
  public fun releaseLabel(releaseLabel: String) {
    cdkBuilder.releaseLabel(releaseLabel)
  }

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
   * @param tags The tags assigned to the application. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
   * @param tags The tags assigned to the application. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of application, such as Spark or Hive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
   * @param type The type of application, such as Spark or Hive. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
   * @param workerTypeSpecifications 
   */
  public fun workerTypeSpecifications(workerTypeSpecifications: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(workerTypeSpecifications)
    cdkBuilder.workerTypeSpecifications(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
   * @param workerTypeSpecifications 
   */
  public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
    cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
   * @param workerTypeSpecifications 
   */
  public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
    cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
  }

  public fun build(): CfnApplication {
    if(_initialCapacity.isNotEmpty()) cdkBuilder.initialCapacity(_initialCapacity)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
