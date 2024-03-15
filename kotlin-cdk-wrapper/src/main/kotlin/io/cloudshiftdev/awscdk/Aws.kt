@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class Aws internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Aws,
) : CdkObject(cdkObject) {
  public companion object {
    public val ACCOUNT_ID: String = software.amazon.awscdk.Aws.ACCOUNT_ID

    public val NO_VALUE: String = software.amazon.awscdk.Aws.NO_VALUE

    public val NOTIFICATION_ARNS: List<String> = software.amazon.awscdk.Aws.NOTIFICATION_ARNS

    public val PARTITION: String = software.amazon.awscdk.Aws.PARTITION

    public val REGION: String = software.amazon.awscdk.Aws.REGION

    public val STACK_ID: String = software.amazon.awscdk.Aws.STACK_ID

    public val STACK_NAME: String = software.amazon.awscdk.Aws.STACK_NAME

    public val URL_SUFFIX: String = software.amazon.awscdk.Aws.URL_SUFFIX

    internal fun wrap(cdkObject: software.amazon.awscdk.Aws): Aws = Aws(cdkObject)

    internal fun unwrap(wrapped: Aws): software.amazon.awscdk.Aws = wrapped.cdkObject
  }
}
