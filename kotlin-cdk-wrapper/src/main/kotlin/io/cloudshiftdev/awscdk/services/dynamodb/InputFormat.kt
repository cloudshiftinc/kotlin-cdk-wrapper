@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The format of the source data.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.dynamoDBJson())
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
public abstract class InputFormat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat,
  ) : InputFormat(cdkObject)

  public companion object {
    public fun csv(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.csv().let(InputFormat::wrap)

    public fun csv(options: CsvOptions): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.csv(options.let(CsvOptions::unwrap)).let(InputFormat::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2755f0fdb57e36185ffda293270efaf3fa63ca1727275d2fcf5c04e945bdd9ba")
    public fun csv(options: CsvOptions.Builder.() -> Unit): InputFormat = csv(CsvOptions(options))

    public fun dynamoDbJson(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.dynamoDBJson().let(InputFormat::wrap)

    public fun ion(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.ion().let(InputFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat): InputFormat
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InputFormat): software.amazon.awscdk.services.dynamodb.InputFormat
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.InputFormat
  }
}
