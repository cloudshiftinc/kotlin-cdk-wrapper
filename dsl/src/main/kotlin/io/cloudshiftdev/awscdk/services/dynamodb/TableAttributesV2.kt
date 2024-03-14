package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TableAttributesV2 {
    /**
     * KMS encryption key for the table.
     *
     * Default: - no KMS encryption key
     */
    public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The name of the global indexes set for the table.
     *
     * Note: You must set either this property or `localIndexes` if you want permissions to be
     * granted for indexes as well as the table itself.
     *
     * Default: - no global indexes
     */
    public fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

    /**
     * Whether or not to grant permissions for all indexes of the table.
     *
     * Note: If false, permissions will only be granted to indexes when `globalIndexes` or
     * `localIndexes` is specified.
     *
     * Default: false
     */
    public fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

    /**
     * The name of the local indexes set for the table.
     *
     * Note: You must set either this property or `globalIndexes` if you want permissions to be
     * granted for indexes as well as the table itself.
     *
     * Default: - no local indexes
     */
    public fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

    /**
     * The ARN of the table.
     *
     * Note: You must specify this or the `tableName`.
     *
     * Default: - table arn generated using `tableName` and region of stack
     */
    public fun tableArn(): String? = unwrap(this).getTableArn()

    /**
     * The ID of the table.
     *
     * Default: - no table id
     */
    public fun tableId(): String? = unwrap(this).getTableId()

    /**
     * The name of the table.
     *
     * Note: You must specify this or the `tableArn`.
     *
     * Default: - table name retrieved from provided `tableArn`
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * The stream ARN of the table.
     *
     * Default: - no table stream ARN
     */
    public fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

    /** A builder for [TableAttributesV2] */
    @CdkDslMarker
    public interface Builder {
        /** @param encryptionKey KMS encryption key for the table. */
        public fun encryptionKey(encryptionKey: IKey)

        /**
         * @param globalIndexes The name of the global indexes set for the table. Note: You must set
         *   either this property or `localIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        public fun globalIndexes(globalIndexes: List<String>)

        /**
         * @param globalIndexes The name of the global indexes set for the table. Note: You must set
         *   either this property or `localIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        public fun globalIndexes(vararg globalIndexes: String)

        /**
         * @param grantIndexPermissions Whether or not to grant permissions for all indexes of the
         *   table. Note: If false, permissions will only be granted to indexes when `globalIndexes`
         *   or `localIndexes` is specified.
         */
        public fun grantIndexPermissions(grantIndexPermissions: Boolean)

        /**
         * @param localIndexes The name of the local indexes set for the table. Note: You must set
         *   either this property or `globalIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        public fun localIndexes(localIndexes: List<String>)

        /**
         * @param localIndexes The name of the local indexes set for the table. Note: You must set
         *   either this property or `globalIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        public fun localIndexes(vararg localIndexes: String)

        /** @param tableArn The ARN of the table. Note: You must specify this or the `tableName`. */
        public fun tableArn(tableArn: String)

        /** @param tableId The ID of the table. */
        public fun tableId(tableId: String)

        /**
         * @param tableName The name of the table. Note: You must specify this or the `tableArn`.
         */
        public fun tableName(tableName: String)

        /** @param tableStreamArn The stream ARN of the table. */
        public fun tableStreamArn(tableStreamArn: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableAttributesV2.Builder =
            software.amazon.awscdk.services.dynamodb.TableAttributesV2.builder()

        /** @param encryptionKey KMS encryption key for the table. */
        override fun encryptionKey(encryptionKey: IKey) {
            cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
        }

        /**
         * @param globalIndexes The name of the global indexes set for the table. Note: You must set
         *   either this property or `localIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        override fun globalIndexes(globalIndexes: List<String>) {
            cdkBuilder.globalIndexes(globalIndexes)
        }

        /**
         * @param globalIndexes The name of the global indexes set for the table. Note: You must set
         *   either this property or `localIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        override fun globalIndexes(vararg globalIndexes: String): Unit =
            globalIndexes(globalIndexes.toList())

        /**
         * @param grantIndexPermissions Whether or not to grant permissions for all indexes of the
         *   table. Note: If false, permissions will only be granted to indexes when `globalIndexes`
         *   or `localIndexes` is specified.
         */
        override fun grantIndexPermissions(grantIndexPermissions: Boolean) {
            cdkBuilder.grantIndexPermissions(grantIndexPermissions)
        }

        /**
         * @param localIndexes The name of the local indexes set for the table. Note: You must set
         *   either this property or `globalIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        override fun localIndexes(localIndexes: List<String>) {
            cdkBuilder.localIndexes(localIndexes)
        }

        /**
         * @param localIndexes The name of the local indexes set for the table. Note: You must set
         *   either this property or `globalIndexes` if you want permissions to be granted for
         *   indexes as well as the table itself.
         */
        override fun localIndexes(vararg localIndexes: String): Unit =
            localIndexes(localIndexes.toList())

        /** @param tableArn The ARN of the table. Note: You must specify this or the `tableName`. */
        override fun tableArn(tableArn: String) {
            cdkBuilder.tableArn(tableArn)
        }

        /** @param tableId The ID of the table. */
        override fun tableId(tableId: String) {
            cdkBuilder.tableId(tableId)
        }

        /**
         * @param tableName The name of the table. Note: You must specify this or the `tableArn`.
         */
        override fun tableName(tableName: String) {
            cdkBuilder.tableName(tableName)
        }

        /** @param tableStreamArn The stream ARN of the table. */
        override fun tableStreamArn(tableStreamArn: String) {
            cdkBuilder.tableStreamArn(tableStreamArn)
        }

        public fun build(): software.amazon.awscdk.services.dynamodb.TableAttributesV2 =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributesV2,
    ) : TableAttributesV2 {
        /**
         * KMS encryption key for the table.
         *
         * Default: - no KMS encryption key
         */
        override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

        /**
         * The name of the global indexes set for the table.
         *
         * Note: You must set either this property or `localIndexes` if you want permissions to be
         * granted for indexes as well as the table itself.
         *
         * Default: - no global indexes
         */
        override fun globalIndexes(): List<String> = unwrap(this).getGlobalIndexes() ?: emptyList()

        /**
         * Whether or not to grant permissions for all indexes of the table.
         *
         * Note: If false, permissions will only be granted to indexes when `globalIndexes` or
         * `localIndexes` is specified.
         *
         * Default: false
         */
        override fun grantIndexPermissions(): Boolean? = unwrap(this).getGrantIndexPermissions()

        /**
         * The name of the local indexes set for the table.
         *
         * Note: You must set either this property or `globalIndexes` if you want permissions to be
         * granted for indexes as well as the table itself.
         *
         * Default: - no local indexes
         */
        override fun localIndexes(): List<String> = unwrap(this).getLocalIndexes() ?: emptyList()

        /**
         * The ARN of the table.
         *
         * Note: You must specify this or the `tableName`.
         *
         * Default: - table arn generated using `tableName` and region of stack
         */
        override fun tableArn(): String? = unwrap(this).getTableArn()

        /**
         * The ID of the table.
         *
         * Default: - no table id
         */
        override fun tableId(): String? = unwrap(this).getTableId()

        /**
         * The name of the table.
         *
         * Note: You must specify this or the `tableArn`.
         *
         * Default: - table name retrieved from provided `tableArn`
         */
        override fun tableName(): String? = unwrap(this).getTableName()

        /**
         * The stream ARN of the table.
         *
         * Default: - no table stream ARN
         */
        override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TableAttributesV2 {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dynamodb.TableAttributesV2
        ): TableAttributesV2 = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TableAttributesV2
        ): software.amazon.awscdk.services.dynamodb.TableAttributesV2 =
            (wrapped as Wrapper).cdkObject
    }
}
