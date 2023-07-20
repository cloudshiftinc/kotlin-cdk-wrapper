@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotAlias

public inline
    fun CfnBotAlias.setConversationLogSettings(block: CfnBotAliasConversationLogSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBotAliasConversationLogSettingsPropertyDsl()
  builder.apply(block)
  return setConversationLogSettings(builder.build())
}

public inline fun CfnBot.setBotFileS3Location(block: CfnBotS3LocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnBotS3LocationPropertyDsl()
  builder.apply(block)
  return setBotFileS3Location(builder.build())
}

public inline
    fun CfnBot.setTestBotAliasSettings(block: CfnBotTestBotAliasSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBotTestBotAliasSettingsPropertyDsl()
  builder.apply(block)
  return setTestBotAliasSettings(builder.build())
}
