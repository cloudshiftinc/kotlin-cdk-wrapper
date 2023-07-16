@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps

@CdkDslMarker
public class CfnUserPoolClientPropsDsl {
  private val cdkBuilder: CfnUserPoolClientProps.Builder = CfnUserPoolClientProps.builder()

  private val _allowedOAuthFlows: MutableList<String> = mutableListOf()

  private val _allowedOAuthScopes: MutableList<String> = mutableListOf()

  private val _callbackUrLs: MutableList<String> = mutableListOf()

  private val _explicitAuthFlows: MutableList<String> = mutableListOf()

  private val _logoutUrLs: MutableList<String> = mutableListOf()

  private val _readAttributes: MutableList<String> = mutableListOf()

  private val _supportedIdentityProviders: MutableList<String> = mutableListOf()

  private val _writeAttributes: MutableList<String> = mutableListOf()

  public fun accessTokenValidity(accessTokenValidity: Number) {
    cdkBuilder.accessTokenValidity(accessTokenValidity)
  }

  public fun allowedOAuthFlows(vararg allowedOAuthFlows: String) {
    _allowedOAuthFlows.addAll(listOf(*allowedOAuthFlows))
  }

  public fun allowedOAuthFlows(allowedOAuthFlows: Collection<String>) {
    _allowedOAuthFlows.addAll(allowedOAuthFlows)
  }

  public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
    cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
  }

  public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
    cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
  }

  public fun allowedOAuthScopes(vararg allowedOAuthScopes: String) {
    _allowedOAuthScopes.addAll(listOf(*allowedOAuthScopes))
  }

  public fun allowedOAuthScopes(allowedOAuthScopes: Collection<String>) {
    _allowedOAuthScopes.addAll(allowedOAuthScopes)
  }

  public fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
    cdkBuilder.analyticsConfiguration(analyticsConfiguration)
  }

  public
      fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty) {
    cdkBuilder.analyticsConfiguration(analyticsConfiguration)
  }

  public fun authSessionValidity(authSessionValidity: Number) {
    cdkBuilder.authSessionValidity(authSessionValidity)
  }

  public fun callbackUrLs(vararg callbackUrLs: String) {
    _callbackUrLs.addAll(listOf(*callbackUrLs))
  }

  public fun callbackUrLs(callbackUrLs: Collection<String>) {
    _callbackUrLs.addAll(callbackUrLs)
  }

  public fun clientName(clientName: String) {
    cdkBuilder.clientName(clientName)
  }

  public fun defaultRedirectUri(defaultRedirectUri: String) {
    cdkBuilder.defaultRedirectUri(defaultRedirectUri)
  }

  public
      fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
    cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
  }

  public
      fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
    cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
  }

  public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  public fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  public fun explicitAuthFlows(vararg explicitAuthFlows: String) {
    _explicitAuthFlows.addAll(listOf(*explicitAuthFlows))
  }

  public fun explicitAuthFlows(explicitAuthFlows: Collection<String>) {
    _explicitAuthFlows.addAll(explicitAuthFlows)
  }

  public fun generateSecret(generateSecret: Boolean) {
    cdkBuilder.generateSecret(generateSecret)
  }

  public fun generateSecret(generateSecret: IResolvable) {
    cdkBuilder.generateSecret(generateSecret)
  }

  public fun idTokenValidity(idTokenValidity: Number) {
    cdkBuilder.idTokenValidity(idTokenValidity)
  }

  public fun logoutUrLs(vararg logoutUrLs: String) {
    _logoutUrLs.addAll(listOf(*logoutUrLs))
  }

  public fun logoutUrLs(logoutUrLs: Collection<String>) {
    _logoutUrLs.addAll(logoutUrLs)
  }

  public fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
    cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
  }

  public fun readAttributes(vararg readAttributes: String) {
    _readAttributes.addAll(listOf(*readAttributes))
  }

  public fun readAttributes(readAttributes: Collection<String>) {
    _readAttributes.addAll(readAttributes)
  }

  public fun refreshTokenValidity(refreshTokenValidity: Number) {
    cdkBuilder.refreshTokenValidity(refreshTokenValidity)
  }

  public fun supportedIdentityProviders(vararg supportedIdentityProviders: String) {
    _supportedIdentityProviders.addAll(listOf(*supportedIdentityProviders))
  }

  public fun supportedIdentityProviders(supportedIdentityProviders: Collection<String>) {
    _supportedIdentityProviders.addAll(supportedIdentityProviders)
  }

  public fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
    cdkBuilder.tokenValidityUnits(tokenValidityUnits)
  }

  public fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty) {
    cdkBuilder.tokenValidityUnits(tokenValidityUnits)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun writeAttributes(vararg writeAttributes: String) {
    _writeAttributes.addAll(listOf(*writeAttributes))
  }

  public fun writeAttributes(writeAttributes: Collection<String>) {
    _writeAttributes.addAll(writeAttributes)
  }

  public fun build(): CfnUserPoolClientProps {
    if(_allowedOAuthFlows.isNotEmpty()) cdkBuilder.allowedOAuthFlows(_allowedOAuthFlows)
    if(_allowedOAuthScopes.isNotEmpty()) cdkBuilder.allowedOAuthScopes(_allowedOAuthScopes)
    if(_callbackUrLs.isNotEmpty()) cdkBuilder.callbackUrLs(_callbackUrLs)
    if(_explicitAuthFlows.isNotEmpty()) cdkBuilder.explicitAuthFlows(_explicitAuthFlows)
    if(_logoutUrLs.isNotEmpty()) cdkBuilder.logoutUrLs(_logoutUrLs)
    if(_readAttributes.isNotEmpty()) cdkBuilder.readAttributes(_readAttributes)
    if(_supportedIdentityProviders.isNotEmpty())
        cdkBuilder.supportedIdentityProviders(_supportedIdentityProviders)
    if(_writeAttributes.isNotEmpty()) cdkBuilder.writeAttributes(_writeAttributes)
    return cdkBuilder.build()
  }
}
