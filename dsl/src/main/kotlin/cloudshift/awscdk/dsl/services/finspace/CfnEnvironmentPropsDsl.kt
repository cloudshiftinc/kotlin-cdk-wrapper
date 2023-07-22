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

  /**
   * @param dataBundles ARNs of FinSpace Data Bundles to install.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(vararg dataBundles: String) {
    _dataBundles.addAll(listOf(*dataBundles))
  }

  /**
   * @param dataBundles ARNs of FinSpace Data Bundles to install.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(dataBundles: Collection<String>) {
    _dataBundles.addAll(dataBundles)
  }

  /**
   * @param description The description of the FinSpace environment.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param federationMode The authentication mode for the environment.
   */
  public fun federationMode(federationMode: String) {
    cdkBuilder.federationMode(federationMode)
  }

  /**
   * @param federationParameters Configuration information when authentication mode is FEDERATED.
   */
  public fun federationParameters(federationParameters: IResolvable) {
    cdkBuilder.federationParameters(federationParameters)
  }

  /**
   * @param federationParameters Configuration information when authentication mode is FEDERATED.
   */
  public
      fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty) {
    cdkBuilder.federationParameters(federationParameters)
  }

  /**
   * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param name The name of the FinSpace environment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param superuserParameters Configuration information for the superuser.
   */
  public fun superuserParameters(superuserParameters: IResolvable) {
    cdkBuilder.superuserParameters(superuserParameters)
  }

  /**
   * @param superuserParameters Configuration information for the superuser.
   */
  public fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty) {
    cdkBuilder.superuserParameters(superuserParameters)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironmentProps {
    if(_dataBundles.isNotEmpty()) cdkBuilder.dataBundles(_dataBundles)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
