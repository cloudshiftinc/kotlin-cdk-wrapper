package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PosixUser {
    /** The POSIX group ID used for all file system operations using this access point. */
    public fun gid(): String

    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     *
     * Default: - None
     */
    public fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

    /** The POSIX user ID used for all file system operations using this access point. */
    public fun uid(): String

    /** A builder for [PosixUser] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param gid The POSIX group ID used for all file system operations using this access
         *   point.
         */
        public fun gid(gid: String)

        /**
         * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
         *   this access point.
         */
        public fun secondaryGids(secondaryGids: List<String>)

        /**
         * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
         *   this access point.
         */
        public fun secondaryGids(vararg secondaryGids: String)

        /**
         * @param uid The POSIX user ID used for all file system operations using this access point.
         */
        public fun uid(uid: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.efs.PosixUser.Builder =
            software.amazon.awscdk.services.efs.PosixUser.builder()

        /**
         * @param gid The POSIX group ID used for all file system operations using this access
         *   point.
         */
        override fun gid(gid: String) {
            cdkBuilder.gid(gid)
        }

        /**
         * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
         *   this access point.
         */
        override fun secondaryGids(secondaryGids: List<String>) {
            cdkBuilder.secondaryGids(secondaryGids)
        }

        /**
         * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
         *   this access point.
         */
        override fun secondaryGids(vararg secondaryGids: String): Unit =
            secondaryGids(secondaryGids.toList())

        /**
         * @param uid The POSIX user ID used for all file system operations using this access point.
         */
        override fun uid(uid: String) {
            cdkBuilder.uid(uid)
        }

        public fun build(): software.amazon.awscdk.services.efs.PosixUser = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.efs.PosixUser,
    ) : PosixUser {
        /** The POSIX group ID used for all file system operations using this access point. */
        override fun gid(): String = unwrap(this).getGid()

        /**
         * Secondary POSIX group IDs used for all file system operations using this access point.
         *
         * Default: - None
         */
        override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

        /** The POSIX user ID used for all file system operations using this access point. */
        override fun uid(): String = unwrap(this).getUid()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): PosixUser {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.PosixUser): PosixUser =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: PosixUser): software.amazon.awscdk.services.efs.PosixUser =
            (wrapped as Wrapper).cdkObject
    }
}
