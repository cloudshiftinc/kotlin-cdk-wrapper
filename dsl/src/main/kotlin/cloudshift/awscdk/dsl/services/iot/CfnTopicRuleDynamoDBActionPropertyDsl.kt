@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleDynamoDBActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.DynamoDBActionProperty.Builder =
      CfnTopicRule.DynamoDBActionProperty.builder()

  public fun hashKeyField(hashKeyField: String) {
    cdkBuilder.hashKeyField(hashKeyField)
  }

  public fun hashKeyType(hashKeyType: String) {
    cdkBuilder.hashKeyType(hashKeyType)
  }

  public fun hashKeyValue(hashKeyValue: String) {
    cdkBuilder.hashKeyValue(hashKeyValue)
  }

  public fun payloadField(payloadField: String) {
    cdkBuilder.payloadField(payloadField)
  }

  public fun rangeKeyField(rangeKeyField: String) {
    cdkBuilder.rangeKeyField(rangeKeyField)
  }

  public fun rangeKeyType(rangeKeyType: String) {
    cdkBuilder.rangeKeyType(rangeKeyType)
  }

  public fun rangeKeyValue(rangeKeyValue: String) {
    cdkBuilder.rangeKeyValue(rangeKeyValue)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnTopicRule.DynamoDBActionProperty = cdkBuilder.build()
}
