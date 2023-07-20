@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.finspace.CfnEnvironment
import software.amazon.awscdk.services.finspace.CfnEnvironmentProps

@CdkDslMarker
public class CfnEnvironmentPropsDsl {
  private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

  private val _dataBundles: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(vararg dataBundles: String) {
    _dataBundles.addAll(listOf(*dataBundles))
  }

  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(dataBundles: Collection<String>) {
    _dataBundles.addAll(dataBundles)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun federationMode(federationMode: String) {
    cdkBuilder.federationMode(federationMode)
  }

  public fun federationParameters(federationParameters: IResolvable) {
    cdkBuilder.federationParameters(federationParameters)
  }

  public
      fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty) {
    cdkBuilder.federationParameters(federationParameters)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun superuserParameters(superuserParameters: IResolvable) {
    cdkBuilder.superuserParameters(superuserParameters)
  }

  public fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty) {
    cdkBuilder.superuserParameters(superuserParameters)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironmentProps {
    if(_dataBundles.isNotEmpty()) cdkBuilder.dataBundles(_dataBundles)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
