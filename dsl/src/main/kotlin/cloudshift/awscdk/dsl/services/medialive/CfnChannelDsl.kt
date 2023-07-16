@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _inputAttachments: MutableList<Any> = mutableListOf()

  public fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
    cdkBuilder.cdiInputSpecification(cdiInputSpecification)
  }

  public
      fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty) {
    cdkBuilder.cdiInputSpecification(cdiInputSpecification)
  }

  public fun channelClass(channelClass: String) {
    cdkBuilder.channelClass(channelClass)
  }

  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  public fun encoderSettings(encoderSettings: IResolvable) {
    cdkBuilder.encoderSettings(encoderSettings)
  }

  public fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty) {
    cdkBuilder.encoderSettings(encoderSettings)
  }

  public fun inputAttachments(vararg inputAttachments: Any) {
    _inputAttachments.addAll(listOf(*inputAttachments))
  }

  public fun inputAttachments(inputAttachments: Collection<Any>) {
    _inputAttachments.addAll(inputAttachments)
  }

  public fun inputAttachments(inputAttachments: IResolvable) {
    cdkBuilder.inputAttachments(inputAttachments)
  }

  public fun inputSpecification(inputSpecification: IResolvable) {
    cdkBuilder.inputSpecification(inputSpecification)
  }

  public fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty) {
    cdkBuilder.inputSpecification(inputSpecification)
  }

  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun maintenance(maintenance: IResolvable) {
    cdkBuilder.maintenance(maintenance)
  }

  public fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty) {
    cdkBuilder.maintenance(maintenance)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnChannel {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_inputAttachments.isNotEmpty()) cdkBuilder.inputAttachments(_inputAttachments)
    return cdkBuilder.build()
  }
}
