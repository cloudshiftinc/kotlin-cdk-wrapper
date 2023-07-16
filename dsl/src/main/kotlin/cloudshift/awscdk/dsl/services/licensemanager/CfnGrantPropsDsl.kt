@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.licensemanager.CfnGrantProps

@CdkDslMarker
public class CfnGrantPropsDsl {
  private val cdkBuilder: CfnGrantProps.Builder = CfnGrantProps.builder()

  private val _allowedOperations: MutableList<String> = mutableListOf()

  private val _principals: MutableList<String> = mutableListOf()

  public fun allowedOperations(vararg allowedOperations: String) {
    _allowedOperations.addAll(listOf(*allowedOperations))
  }

  public fun allowedOperations(allowedOperations: Collection<String>) {
    _allowedOperations.addAll(allowedOperations)
  }

  public fun grantName(grantName: String) {
    cdkBuilder.grantName(grantName)
  }

  public fun homeRegion(homeRegion: String) {
    cdkBuilder.homeRegion(homeRegion)
  }

  public fun licenseArn(licenseArn: String) {
    cdkBuilder.licenseArn(licenseArn)
  }

  public fun principals(vararg principals: String) {
    _principals.addAll(listOf(*principals))
  }

  public fun principals(principals: Collection<String>) {
    _principals.addAll(principals)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnGrantProps {
    if(_allowedOperations.isNotEmpty()) cdkBuilder.allowedOperations(_allowedOperations)
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    return cdkBuilder.build()
  }
}
