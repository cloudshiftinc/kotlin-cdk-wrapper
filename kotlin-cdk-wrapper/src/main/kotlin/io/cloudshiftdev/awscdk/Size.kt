@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the amount of digital storage.
 *
 * The amount can be specified either as a literal value (e.g: `10`) which
 * cannot be negative, or as an unresolved number token.
 *
 * When the amount is passed as a token, unit conversion is not possible.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * // Provide a Lambda function that will transform records before delivery, with custom
 * // buffering and retry configuration
 * Function lambdaFunction = Function.Builder.create(this, "Processor")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "process-records")))
 * .build();
 * LambdaFunctionProcessor lambdaProcessor = LambdaFunctionProcessor.Builder.create(lambdaFunction)
 * .bufferInterval(Duration.minutes(5))
 * .bufferSize(Size.mebibytes(5))
 * .retries(5)
 * .build();
 * S3Bucket s3Destination = S3Bucket.Builder.create(bucket)
 * .processor(lambdaProcessor)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * ```
 */
public open class Size(
  cdkObject: software.amazon.awscdk.Size,
) : CdkObject(cdkObject) {
  /**
   * Checks if size is a token or a resolvable object.
   */
  public open fun isUnresolved(): Boolean = unwrap(this).isUnresolved()

  /**
   * Return this storage as a total number of bytes.
   *
   * @return the quantity expressed in bytes
   * @param opts the conversion options.
   */
  public open fun toBytes(): Number = unwrap(this).toBytes()

  /**
   * Return this storage as a total number of bytes.
   *
   * @return the quantity expressed in bytes
   * @param opts the conversion options.
   */
  public open fun toBytes(opts: SizeConversionOptions): Number =
      unwrap(this).toBytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of bytes.
   *
   * @return the quantity expressed in bytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d20dc0fadb5f244c1d82396ece94c0ac6492cacbb89b62dc69c5ef194c49e9f")
  public open fun toBytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toBytes(SizeConversionOptions(opts))

  /**
   * Return this storage as a total number of gibibytes.
   *
   * @return the quantity of bytes expressed in gibibytes
   * @param opts the conversion options.
   */
  public open fun toGibibytes(): Number = unwrap(this).toGibibytes()

  /**
   * Return this storage as a total number of gibibytes.
   *
   * @return the quantity of bytes expressed in gibibytes
   * @param opts the conversion options.
   */
  public open fun toGibibytes(opts: SizeConversionOptions): Number =
      unwrap(this).toGibibytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of gibibytes.
   *
   * @return the quantity of bytes expressed in gibibytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a890c622d22930199b43011e978dddc313cd4922c14ede293fe61113a84bf04")
  public open fun toGibibytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toGibibytes(SizeConversionOptions(opts))

  /**
   * Return this storage as a total number of kibibytes.
   *
   * @return the quantity of bytes expressed in kibibytes
   * @param opts the conversion options.
   */
  public open fun toKibibytes(): Number = unwrap(this).toKibibytes()

  /**
   * Return this storage as a total number of kibibytes.
   *
   * @return the quantity of bytes expressed in kibibytes
   * @param opts the conversion options.
   */
  public open fun toKibibytes(opts: SizeConversionOptions): Number =
      unwrap(this).toKibibytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of kibibytes.
   *
   * @return the quantity of bytes expressed in kibibytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04eba4b004c3d8cc120cc08aa3741e658a28cb8ab4cd3e0b9098d6e7e5c560b5")
  public open fun toKibibytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toKibibytes(SizeConversionOptions(opts))

  /**
   * Return this storage as a total number of mebibytes.
   *
   * @return the quantity of bytes expressed in mebibytes
   * @param opts the conversion options.
   */
  public open fun toMebibytes(): Number = unwrap(this).toMebibytes()

  /**
   * Return this storage as a total number of mebibytes.
   *
   * @return the quantity of bytes expressed in mebibytes
   * @param opts the conversion options.
   */
  public open fun toMebibytes(opts: SizeConversionOptions): Number =
      unwrap(this).toMebibytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of mebibytes.
   *
   * @return the quantity of bytes expressed in mebibytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14c23968f7b9b02a525f2d3ba13883b63a18d048d39a5a945bdeb9bcb1ed24d9")
  public open fun toMebibytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toMebibytes(SizeConversionOptions(opts))

  /**
   * Return this storage as a total number of pebibytes.
   *
   * @return the quantity of bytes expressed in pebibytes
   * @param opts the conversion options.
   */
  public open fun toPebibytes(): Number = unwrap(this).toPebibytes()

  /**
   * Return this storage as a total number of pebibytes.
   *
   * @return the quantity of bytes expressed in pebibytes
   * @param opts the conversion options.
   */
  public open fun toPebibytes(opts: SizeConversionOptions): Number =
      unwrap(this).toPebibytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of pebibytes.
   *
   * @return the quantity of bytes expressed in pebibytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0baa62bd02bef8b7a85f6ac62dce9f9c8c90342aded69db4039b38a4d222e677")
  public open fun toPebibytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toPebibytes(SizeConversionOptions(opts))

  /**
   * Return this storage as a total number of tebibytes.
   *
   * @return the quantity of bytes expressed in tebibytes
   * @param opts the conversion options.
   */
  public open fun toTebibytes(): Number = unwrap(this).toTebibytes()

  /**
   * Return this storage as a total number of tebibytes.
   *
   * @return the quantity of bytes expressed in tebibytes
   * @param opts the conversion options.
   */
  public open fun toTebibytes(opts: SizeConversionOptions): Number =
      unwrap(this).toTebibytes(opts.let(SizeConversionOptions.Companion::unwrap))

  /**
   * Return this storage as a total number of tebibytes.
   *
   * @return the quantity of bytes expressed in tebibytes
   * @param opts the conversion options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fdd4b42093e452fa2bab449051709077b8d4c2d670e824682c3bf08947e38970")
  public open fun toTebibytes(opts: SizeConversionOptions.Builder.() -> Unit): Number =
      toTebibytes(SizeConversionOptions(opts))

  public companion object {
    public fun bytes(amount: Number): Size =
        software.amazon.awscdk.Size.bytes(amount).let(Size::wrap)

    public fun gibibytes(amount: Number): Size =
        software.amazon.awscdk.Size.gibibytes(amount).let(Size::wrap)

    public fun kibibytes(amount: Number): Size =
        software.amazon.awscdk.Size.kibibytes(amount).let(Size::wrap)

    public fun mebibytes(amount: Number): Size =
        software.amazon.awscdk.Size.mebibytes(amount).let(Size::wrap)

    public fun pebibytes(amount: Number): Size =
        software.amazon.awscdk.Size.pebibytes(amount).let(Size::wrap)

    public fun tebibytes(amount: Number): Size =
        software.amazon.awscdk.Size.tebibytes(amount).let(Size::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Size): Size = Size(cdkObject)

    internal fun unwrap(wrapped: Size): software.amazon.awscdk.Size = wrapped.cdkObject as
        software.amazon.awscdk.Size
  }
}
