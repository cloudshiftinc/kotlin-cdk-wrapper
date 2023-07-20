@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnLedger
import software.amazon.awscdk.services.qldb.CfnLedgerProps
import software.amazon.awscdk.services.qldb.CfnStream
import software.amazon.awscdk.services.qldb.CfnStreamProps
import software.constructs.Construct

public object qldb {
  public inline fun cfnLedger(
    scope: Construct,
    id: String,
    block: CfnLedgerDsl.() -> Unit = {},
  ): CfnLedger {
    val builder = CfnLedgerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLedgerProps(block: CfnLedgerPropsDsl.() -> Unit = {}): CfnLedgerProps {
    val builder = CfnLedgerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStream(
    scope: Construct,
    id: String,
    block: CfnStreamDsl.() -> Unit = {},
  ): CfnStream {
    val builder = CfnStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamKinesisConfigurationProperty(block: CfnStreamKinesisConfigurationPropertyDsl.() -> Unit
      = {}): CfnStream.KinesisConfigurationProperty {
    val builder = CfnStreamKinesisConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
    val builder = CfnStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
