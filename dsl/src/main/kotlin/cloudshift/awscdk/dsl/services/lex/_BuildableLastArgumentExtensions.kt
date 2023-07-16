@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.amazon.awscdk.services.lex.CfnResourcePolicy

public inline fun CfnBot.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnBotAlias.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnBotAlias.setConversationLogSettings(block: CfnBotAliasConversationLogSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBotAliasConversationLogSettingsPropertyDsl()
  builder.apply(block)
  return setConversationLogSettings(builder.build())
}

public inline fun CfnBotVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourcePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
