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
  /**
   * The `AWS::QLDB::Ledger` resource specifies a new Amazon Quantum Ledger Database (Amazon QLDB)
   * ledger in your AWS account .
   *
   * Amazon QLDB is a fully managed ledger database that provides a transparent, immutable, and
   * cryptographically verifiable transaction log owned by a central trusted authority. You can use
   * QLDB to track all application data changes, and maintain a complete and verifiable history of
   * changes over time.
   *
   * For more information, see
   * [CreateLedger](https://docs.aws.amazon.com/qldb/latest/developerguide/API_CreateLedger.html) in
   * the *Amazon QLDB API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.qldb.*;
   * CfnLedger cfnLedger = CfnLedger.Builder.create(this, "MyCfnLedger")
   * .permissionsMode("permissionsMode")
   * // the properties below are optional
   * .deletionProtection(false)
   * .kmsKey("kmsKey")
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html)
   */
  public inline fun cfnLedger(
    scope: Construct,
    id: String,
    block: CfnLedgerDsl.() -> Unit = {},
  ): CfnLedger {
    val builder = CfnLedgerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnLedger`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.qldb.*;
   * CfnLedgerProps cfnLedgerProps = CfnLedgerProps.builder()
   * .permissionsMode("permissionsMode")
   * // the properties below are optional
   * .deletionProtection(false)
   * .kmsKey("kmsKey")
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html)
   */
  public inline fun cfnLedgerProps(block: CfnLedgerPropsDsl.() -> Unit = {}): CfnLedgerProps {
    val builder = CfnLedgerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::QLDB::Stream` resource specifies a journal stream for a given Amazon Quantum Ledger
   * Database (Amazon QLDB) ledger.
   *
   * The stream captures every document revision that is committed to the ledger's journal and
   * delivers the data to a specified Amazon Kinesis Data Streams resource.
   *
   * For more information, see
   * [StreamJournalToKinesis](https://docs.aws.amazon.com/qldb/latest/developerguide/API_StreamJournalToKinesis.html)
   * in the *Amazon QLDB API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.qldb.*;
   * CfnStream cfnStream = CfnStream.Builder.create(this, "MyCfnStream")
   * .inclusiveStartTime("inclusiveStartTime")
   * .kinesisConfiguration(KinesisConfigurationProperty.builder()
   * .aggregationEnabled(false)
   * .streamArn("streamArn")
   * .build())
   * .ledgerName("ledgerName")
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .exclusiveEndTime("exclusiveEndTime")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html)
   */
  public inline fun cfnStream(
    scope: Construct,
    id: String,
    block: CfnStreamDsl.() -> Unit = {},
  ): CfnStream {
    val builder = CfnStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration settings of the Amazon Kinesis Data Streams destination for an Amazon QLDB
   * journal stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.qldb.*;
   * KinesisConfigurationProperty kinesisConfigurationProperty =
   * KinesisConfigurationProperty.builder()
   * .aggregationEnabled(false)
   * .streamArn("streamArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html)
   */
  public inline
      fun cfnStreamKinesisConfigurationProperty(block: CfnStreamKinesisConfigurationPropertyDsl.() -> Unit
      = {}): CfnStream.KinesisConfigurationProperty {
    val builder = CfnStreamKinesisConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnStream`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.qldb.*;
   * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
   * .inclusiveStartTime("inclusiveStartTime")
   * .kinesisConfiguration(KinesisConfigurationProperty.builder()
   * .aggregationEnabled(false)
   * .streamArn("streamArn")
   * .build())
   * .ledgerName("ledgerName")
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .exclusiveEndTime("exclusiveEndTime")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html)
   */
  public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
    val builder = CfnStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
