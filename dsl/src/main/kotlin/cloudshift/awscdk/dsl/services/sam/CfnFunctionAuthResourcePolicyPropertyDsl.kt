@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionAuthResourcePolicyPropertyDsl {
  private val cdkBuilder: CfnFunction.AuthResourcePolicyProperty.Builder =
      CfnFunction.AuthResourcePolicyProperty.builder()

  private val _awsAccountBlacklist: MutableList<String> = mutableListOf()

  private val _awsAccountWhitelist: MutableList<String> = mutableListOf()

  private val _customStatements: MutableList<Any> = mutableListOf()

  private val _intrinsicVpcBlacklist: MutableList<String> = mutableListOf()

  private val _intrinsicVpcWhitelist: MutableList<String> = mutableListOf()

  private val _intrinsicVpceBlacklist: MutableList<String> = mutableListOf()

  private val _intrinsicVpceWhitelist: MutableList<String> = mutableListOf()

  private val _ipRangeBlacklist: MutableList<String> = mutableListOf()

  private val _ipRangeWhitelist: MutableList<String> = mutableListOf()

  private val _sourceVpcBlacklist: MutableList<String> = mutableListOf()

  private val _sourceVpcWhitelist: MutableList<String> = mutableListOf()

  public fun awsAccountBlacklist(vararg awsAccountBlacklist: String) {
    _awsAccountBlacklist.addAll(listOf(*awsAccountBlacklist))
  }

  public fun awsAccountBlacklist(awsAccountBlacklist: Collection<String>) {
    _awsAccountBlacklist.addAll(awsAccountBlacklist)
  }

  public fun awsAccountWhitelist(vararg awsAccountWhitelist: String) {
    _awsAccountWhitelist.addAll(listOf(*awsAccountWhitelist))
  }

  public fun awsAccountWhitelist(awsAccountWhitelist: Collection<String>) {
    _awsAccountWhitelist.addAll(awsAccountWhitelist)
  }

  public fun customStatements(vararg customStatements: Any) {
    _customStatements.addAll(listOf(*customStatements))
  }

  public fun customStatements(customStatements: Collection<Any>) {
    _customStatements.addAll(customStatements)
  }

  public fun customStatements(customStatements: IResolvable) {
    cdkBuilder.customStatements(customStatements)
  }

  public fun intrinsicVpcBlacklist(vararg intrinsicVpcBlacklist: String) {
    _intrinsicVpcBlacklist.addAll(listOf(*intrinsicVpcBlacklist))
  }

  public fun intrinsicVpcBlacklist(intrinsicVpcBlacklist: Collection<String>) {
    _intrinsicVpcBlacklist.addAll(intrinsicVpcBlacklist)
  }

  public fun intrinsicVpcWhitelist(vararg intrinsicVpcWhitelist: String) {
    _intrinsicVpcWhitelist.addAll(listOf(*intrinsicVpcWhitelist))
  }

  public fun intrinsicVpcWhitelist(intrinsicVpcWhitelist: Collection<String>) {
    _intrinsicVpcWhitelist.addAll(intrinsicVpcWhitelist)
  }

  public fun intrinsicVpceBlacklist(vararg intrinsicVpceBlacklist: String) {
    _intrinsicVpceBlacklist.addAll(listOf(*intrinsicVpceBlacklist))
  }

  public fun intrinsicVpceBlacklist(intrinsicVpceBlacklist: Collection<String>) {
    _intrinsicVpceBlacklist.addAll(intrinsicVpceBlacklist)
  }

  public fun intrinsicVpceWhitelist(vararg intrinsicVpceWhitelist: String) {
    _intrinsicVpceWhitelist.addAll(listOf(*intrinsicVpceWhitelist))
  }

  public fun intrinsicVpceWhitelist(intrinsicVpceWhitelist: Collection<String>) {
    _intrinsicVpceWhitelist.addAll(intrinsicVpceWhitelist)
  }

  public fun ipRangeBlacklist(vararg ipRangeBlacklist: String) {
    _ipRangeBlacklist.addAll(listOf(*ipRangeBlacklist))
  }

  public fun ipRangeBlacklist(ipRangeBlacklist: Collection<String>) {
    _ipRangeBlacklist.addAll(ipRangeBlacklist)
  }

  public fun ipRangeWhitelist(vararg ipRangeWhitelist: String) {
    _ipRangeWhitelist.addAll(listOf(*ipRangeWhitelist))
  }

  public fun ipRangeWhitelist(ipRangeWhitelist: Collection<String>) {
    _ipRangeWhitelist.addAll(ipRangeWhitelist)
  }

  public fun sourceVpcBlacklist(vararg sourceVpcBlacklist: String) {
    _sourceVpcBlacklist.addAll(listOf(*sourceVpcBlacklist))
  }

  public fun sourceVpcBlacklist(sourceVpcBlacklist: Collection<String>) {
    _sourceVpcBlacklist.addAll(sourceVpcBlacklist)
  }

  public fun sourceVpcWhitelist(vararg sourceVpcWhitelist: String) {
    _sourceVpcWhitelist.addAll(listOf(*sourceVpcWhitelist))
  }

  public fun sourceVpcWhitelist(sourceVpcWhitelist: Collection<String>) {
    _sourceVpcWhitelist.addAll(sourceVpcWhitelist)
  }

  public fun build(): CfnFunction.AuthResourcePolicyProperty {
    if(_awsAccountBlacklist.isNotEmpty()) cdkBuilder.awsAccountBlacklist(_awsAccountBlacklist)
    if(_awsAccountWhitelist.isNotEmpty()) cdkBuilder.awsAccountWhitelist(_awsAccountWhitelist)
    if(_customStatements.isNotEmpty()) cdkBuilder.customStatements(_customStatements)
    if(_intrinsicVpcBlacklist.isNotEmpty()) cdkBuilder.intrinsicVpcBlacklist(_intrinsicVpcBlacklist)
    if(_intrinsicVpcWhitelist.isNotEmpty()) cdkBuilder.intrinsicVpcWhitelist(_intrinsicVpcWhitelist)
    if(_intrinsicVpceBlacklist.isNotEmpty())
        cdkBuilder.intrinsicVpceBlacklist(_intrinsicVpceBlacklist)
    if(_intrinsicVpceWhitelist.isNotEmpty())
        cdkBuilder.intrinsicVpceWhitelist(_intrinsicVpceWhitelist)
    if(_ipRangeBlacklist.isNotEmpty()) cdkBuilder.ipRangeBlacklist(_ipRangeBlacklist)
    if(_ipRangeWhitelist.isNotEmpty()) cdkBuilder.ipRangeWhitelist(_ipRangeWhitelist)
    if(_sourceVpcBlacklist.isNotEmpty()) cdkBuilder.sourceVpcBlacklist(_sourceVpcBlacklist)
    if(_sourceVpcWhitelist.isNotEmpty()) cdkBuilder.sourceVpcWhitelist(_sourceVpcWhitelist)
    return cdkBuilder.build()
  }
}
