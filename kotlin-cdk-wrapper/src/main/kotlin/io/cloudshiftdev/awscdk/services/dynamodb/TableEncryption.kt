@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

public enum class TableEncryption(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryption,
) {
  DEFAULT(software.amazon.awscdk.services.dynamodb.TableEncryption.DEFAULT),
  CUSTOMER_MANAGED(software.amazon.awscdk.services.dynamodb.TableEncryption.CUSTOMER_MANAGED),
  AWS_MANAGED(software.amazon.awscdk.services.dynamodb.TableEncryption.AWS_MANAGED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryption):
        TableEncryption = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.TableEncryption.DEFAULT -> TableEncryption.DEFAULT
      software.amazon.awscdk.services.dynamodb.TableEncryption.CUSTOMER_MANAGED ->
          TableEncryption.CUSTOMER_MANAGED
      software.amazon.awscdk.services.dynamodb.TableEncryption.AWS_MANAGED ->
          TableEncryption.AWS_MANAGED
    }

    internal fun unwrap(wrapped: TableEncryption):
        software.amazon.awscdk.services.dynamodb.TableEncryption = wrapped.cdkObject
  }
}
