@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The options for imported source files in CSV format.
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
 * .inputFormat(InputFormat.csv(CsvOptions.builder()
 * .delimiter(",")
 * .headerList(List.of("id", "name"))
 * .build()))
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
public interface CsvOptions {
  /**
   * The delimiter used for separating items in the CSV file being imported.
   *
   * Valid delimiters are as follows:
   *
   * * comma (`,`)
   * * tab (`\t`)
   * * colon (`:`)
   * * semicolon (`;`)
   * * pipe (`|`)
   * * space (` `)
   *
   * Default: - use comma as a delimiter.
   */
  public fun delimiter(): String? = unwrap(this).getDelimiter()

  /**
   * List of the headers used to specify a common header for all source CSV files being imported.
   *
   * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
   * instead of the header.
   * If this field is not specified the the first line of each CSV file is treated as the header.
   *
   * Default: - the first line of the CSV file is treated as the header
   */
  public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

  /**
   * A builder for [CsvOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param delimiter The delimiter used for separating items in the CSV file being imported.
     * Valid delimiters are as follows:
     *
     * * comma (`,`)
     * * tab (`\t`)
     * * colon (`:`)
     * * semicolon (`;`)
     * * pipe (`|`)
     * * space (` `)
     */
    public fun delimiter(delimiter: String)

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     * files being imported.
     * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
     * instead of the header.
     * If this field is not specified the the first line of each CSV file is treated as the header.
     */
    public fun headerList(headerList: List<String>)

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     * files being imported.
     * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
     * instead of the header.
     * If this field is not specified the the first line of each CSV file is treated as the header.
     */
    public fun headerList(vararg headerList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CsvOptions.Builder =
        software.amazon.awscdk.services.dynamodb.CsvOptions.builder()

    /**
     * @param delimiter The delimiter used for separating items in the CSV file being imported.
     * Valid delimiters are as follows:
     *
     * * comma (`,`)
     * * tab (`\t`)
     * * colon (`:`)
     * * semicolon (`;`)
     * * pipe (`|`)
     * * space (` `)
     */
    override fun delimiter(delimiter: String) {
      cdkBuilder.delimiter(delimiter)
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     * files being imported.
     * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
     * instead of the header.
     * If this field is not specified the the first line of each CSV file is treated as the header.
     */
    override fun headerList(headerList: List<String>) {
      cdkBuilder.headerList(headerList)
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     * files being imported.
     * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
     * instead of the header.
     * If this field is not specified the the first line of each CSV file is treated as the header.
     */
    override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

    public fun build(): software.amazon.awscdk.services.dynamodb.CsvOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.CsvOptions,
  ) : CdkObject(cdkObject), CsvOptions {
    /**
     * The delimiter used for separating items in the CSV file being imported.
     *
     * Valid delimiters are as follows:
     *
     * * comma (`,`)
     * * tab (`\t`)
     * * colon (`:`)
     * * semicolon (`;`)
     * * pipe (`|`)
     * * space (` `)
     *
     * Default: - use comma as a delimiter.
     */
    override fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * List of the headers used to specify a common header for all source CSV files being imported.
     *
     * **NOTE**: If this field is specified then the first line of each CSV file is treated as data
     * instead of the header.
     * If this field is not specified the the first line of each CSV file is treated as the header.
     *
     * Default: - the first line of the CSV file is treated as the header
     */
    override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CsvOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CsvOptions): CsvOptions =
        CdkObjectWrappers.wrap(cdkObject) as CsvOptions

    internal fun unwrap(wrapped: CsvOptions): software.amazon.awscdk.services.dynamodb.CsvOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.CsvOptions
  }
}
