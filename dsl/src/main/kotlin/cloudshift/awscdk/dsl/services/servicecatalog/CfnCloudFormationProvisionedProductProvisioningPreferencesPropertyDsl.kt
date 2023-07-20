@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct

@CdkDslMarker
public class CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl {
  private val cdkBuilder:
      CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder =
      CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.builder()

  private val _stackSetAccounts: MutableList<String> = mutableListOf()

  private val _stackSetRegions: MutableList<String> = mutableListOf()

  public fun stackSetAccounts(vararg stackSetAccounts: String) {
    _stackSetAccounts.addAll(listOf(*stackSetAccounts))
  }

  public fun stackSetAccounts(stackSetAccounts: Collection<String>) {
    _stackSetAccounts.addAll(stackSetAccounts)
  }

  public fun stackSetFailureToleranceCount(stackSetFailureToleranceCount: Number) {
    cdkBuilder.stackSetFailureToleranceCount(stackSetFailureToleranceCount)
  }

  public fun stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage: Number) {
    cdkBuilder.stackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage)
  }

  public fun stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount: Number) {
    cdkBuilder.stackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount)
  }

  public fun stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage: Number) {
    cdkBuilder.stackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage)
  }

  public fun stackSetOperationType(stackSetOperationType: String) {
    cdkBuilder.stackSetOperationType(stackSetOperationType)
  }

  public fun stackSetRegions(vararg stackSetRegions: String) {
    _stackSetRegions.addAll(listOf(*stackSetRegions))
  }

  public fun stackSetRegions(stackSetRegions: Collection<String>) {
    _stackSetRegions.addAll(stackSetRegions)
  }

  public fun build(): CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty {
    if(_stackSetAccounts.isNotEmpty()) cdkBuilder.stackSetAccounts(_stackSetAccounts)
    if(_stackSetRegions.isNotEmpty()) cdkBuilder.stackSetRegions(_stackSetRegions)
    return cdkBuilder.build()
  }
}
