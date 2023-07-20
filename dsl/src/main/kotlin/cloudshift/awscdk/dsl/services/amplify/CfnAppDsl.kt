@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp
import software.constructs.Construct

@CdkDslMarker
public class CfnAppDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

  private val _customRules: MutableList<Any> = mutableListOf()

  private val _environmentVariables: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessToken(accessToken: String) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
    cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig)
  }

  public
      fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty) {
    cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig)
  }

  public fun basicAuthConfig(basicAuthConfig: IResolvable) {
    cdkBuilder.basicAuthConfig(basicAuthConfig)
  }

  public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
    cdkBuilder.basicAuthConfig(basicAuthConfig)
  }

  public fun buildSpec(buildSpec: String) {
    cdkBuilder.buildSpec(buildSpec)
  }

  public fun customHeaders(customHeaders: String) {
    cdkBuilder.customHeaders(customHeaders)
  }

  public fun customRules(vararg customRules: Any) {
    _customRules.addAll(listOf(*customRules))
  }

  public fun customRules(customRules: Collection<Any>) {
    _customRules.addAll(customRules)
  }

  public fun customRules(customRules: IResolvable) {
    cdkBuilder.customRules(customRules)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
    cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
  }

  public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
    cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
  }

  public fun environmentVariables(vararg environmentVariables: Any) {
    _environmentVariables.addAll(listOf(*environmentVariables))
  }

  public fun environmentVariables(environmentVariables: Collection<Any>) {
    _environmentVariables.addAll(environmentVariables)
  }

  public fun environmentVariables(environmentVariables: IResolvable) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun iamServiceRole(iamServiceRole: String) {
    cdkBuilder.iamServiceRole(iamServiceRole)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun oauthToken(oauthToken: String) {
    cdkBuilder.oauthToken(oauthToken)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApp {
    if(_customRules.isNotEmpty()) cdkBuilder.customRules(_customRules)
    if(_environmentVariables.isNotEmpty()) cdkBuilder.environmentVariables(_environmentVariables)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
