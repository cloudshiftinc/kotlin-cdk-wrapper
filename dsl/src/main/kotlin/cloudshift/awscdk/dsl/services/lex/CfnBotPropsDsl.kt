@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotProps

@CdkDslMarker
public class CfnBotPropsDsl {
  private val cdkBuilder: CfnBotProps.Builder = CfnBotProps.builder()

  private val _botLocales: MutableList<Any> = mutableListOf()

  private val _botTags: MutableList<Any> = mutableListOf()

  private val _testBotAliasTags: MutableList<Any> = mutableListOf()

  public fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
    cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
  }

  public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
    cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
  }

  public fun botFileS3Location(botFileS3Location: IResolvable) {
    cdkBuilder.botFileS3Location(botFileS3Location)
  }

  public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty) {
    cdkBuilder.botFileS3Location(botFileS3Location)
  }

  public fun botLocales(vararg botLocales: Any) {
    _botLocales.addAll(listOf(*botLocales))
  }

  public fun botLocales(botLocales: Collection<Any>) {
    _botLocales.addAll(botLocales)
  }

  public fun botLocales(botLocales: IResolvable) {
    cdkBuilder.botLocales(botLocales)
  }

  public fun botTags(vararg botTags: Any) {
    _botTags.addAll(listOf(*botTags))
  }

  public fun botTags(botTags: Collection<Any>) {
    _botTags.addAll(botTags)
  }

  public fun botTags(botTags: IResolvable) {
    cdkBuilder.botTags(botTags)
  }

  public fun dataPrivacy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.dataPrivacy(builder.map)
  }

  public fun dataPrivacy(dataPrivacy: Any) {
    cdkBuilder.dataPrivacy(dataPrivacy)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
    cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
    cdkBuilder.testBotAliasSettings(testBotAliasSettings)
  }

  public fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty) {
    cdkBuilder.testBotAliasSettings(testBotAliasSettings)
  }

  public fun testBotAliasTags(vararg testBotAliasTags: Any) {
    _testBotAliasTags.addAll(listOf(*testBotAliasTags))
  }

  public fun testBotAliasTags(testBotAliasTags: Collection<Any>) {
    _testBotAliasTags.addAll(testBotAliasTags)
  }

  public fun testBotAliasTags(testBotAliasTags: IResolvable) {
    cdkBuilder.testBotAliasTags(testBotAliasTags)
  }

  public fun build(): CfnBotProps {
    if(_botLocales.isNotEmpty()) cdkBuilder.botLocales(_botLocales)
    if(_botTags.isNotEmpty()) cdkBuilder.botTags(_botTags)
    if(_testBotAliasTags.isNotEmpty()) cdkBuilder.testBotAliasTags(_testBotAliasTags)
    return cdkBuilder.build()
  }
}
